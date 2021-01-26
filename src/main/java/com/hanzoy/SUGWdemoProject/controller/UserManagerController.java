package com.hanzoy.SUGWdemoProject.controller;

import com.hanzoy.SUGWdemoProject.domain.User;
import com.hanzoy.SUGWdemoProject.dto.TokenParam;
import com.hanzoy.SUGWdemoProject.dto.CommonResult;
import com.hanzoy.SUGWdemoProject.dto.LoginParam;
import com.hanzoy.SUGWdemoProject.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class UserManagerController {

    @Autowired
    LoginService loginService;

    @PostMapping("/{code}/login")
    public CommonResult<Map<String, String>> login(@PathVariable int code, @Validated @RequestBody LoginParam param){
        log.info("API访问: code{} 访问了登录接口",code);
        String token = loginService.login(param.getUsername(), param.getPassword(), code);
        HashMap<String, String> data = new HashMap<>();
        data.put("token", token);
        log.info("API访问: code{} 使用"+param.getUsername()+"账号登录成功",code);
        return CommonResult.success(data);
    }

    @PostMapping("/{code}/getRole")
    public CommonResult<Map<String, String>> checkToken(@PathVariable int code, @Validated  @RequestBody TokenParam param){
        log.info("API访问: code{} 访问了getRole接口",code);
        User res = loginService.check(param.getToken());
        HashMap<String, String> data = new HashMap<>();
        String role;
        if(res.getRole())
            role = "superAdmin";
        else
            role = "admin";
        data.put("name", res.getUsername());
        data.put("role", role);
        log.info("API访问: code{} 使用"+param.getToken()+"Token访问成功",code);
        return CommonResult.success(data);
    }
}
