package com.hanzoy.SUGWdemoProject.service.impl;

import com.hanzoy.SUGWdemoProject.domain.User;
import com.hanzoy.SUGWdemoProject.domain.UserExample;
import com.hanzoy.SUGWdemoProject.exception.TokenErrorException;
import com.hanzoy.SUGWdemoProject.exception.UserAccountPasswordErrorException;
import com.hanzoy.SUGWdemoProject.mapper.UserMapper;
import com.hanzoy.SUGWdemoProject.service.LoginService;
import com.hanzoy.utils.JWTUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    UserMapper userMapper;

    @Override
    public String login(String username, String password, int code) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(userExample);
        if(users.isEmpty()){
            throw new UserAccountPasswordErrorException("账号密码错误");
        }
        return JWTUtils.createToken(users.get(0), "SIPC115Hanzoy", 60*60*24);
    }

    @Override
    public User check(String token) {
        if(!JWTUtils.checkToken(token, "SIPC115Hanzoy")){
            throw new TokenErrorException("失效的token");
        }
        return JWTUtils.getBean(token, "SIPC115Hanzoy", User.class);
    }
}
