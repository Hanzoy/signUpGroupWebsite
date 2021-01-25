package com.hanzoy.SUGWdemoProject.controller;

import com.hanzoy.SUGWdemoProject.dto.CommonResult;
import com.hanzoy.SUGWdemoProject.dto.PostStudentWillParam;
import com.hanzoy.SUGWdemoProject.service.PostUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@Slf4j
@RestController
public class PostUserController {

    @Autowired
    PostUserService postUserService;

    @PostMapping("/{code}/post")
    public CommonResult<Object> postStu(@PathVariable int code,@Validated @RequestBody PostStudentWillParam param){
        log.info("表单提交: code{} 提交了表单，内容为"+param,code);
        postUserService.save(code, param);
        return CommonResult.success();
    }
}
