package com.hanzoy.SUGWdemoProject.controller;

import com.hanzoy.SUGWdemoProject.dto.GetStuInfoParam;
import com.hanzoy.SUGWdemoProject.dto.TokenParam;
import com.hanzoy.SUGWdemoProject.dto.CommonResult;
import com.hanzoy.SUGWdemoProject.dto.GetStuInfoResult;
import com.hanzoy.SUGWdemoProject.service.GetStuInfoService;
import com.hanzoy.SUGWdemoProject.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class GetStuInfoController {

    @Autowired
    GetStuInfoService getStuInfoService;

    @Autowired
    LoginService loginService;

    @PostMapping("/{code}/getAllStuInfo")
    public CommonResult<GetStuInfoResult> GetAllStuInfo(@PathVariable int code, @RequestParam int page, @RequestParam int pageSize , @RequestBody TokenParam param){
        log.info("API访问: code{} 访问了查询接口",code);
        loginService.check(param.getToken());
        GetStuInfoResult allStuInfo = getStuInfoService.getAllStuInfo(code, page, pageSize);
        log.info("查询成功，返回{}条数据",allStuInfo.getStudents().size());
        return CommonResult.success(allStuInfo);
    }

    @PostMapping("/{code}/getStuInfo")
    public CommonResult<GetStuInfoResult> GetStuInfo(@PathVariable int code, @RequestParam int page, @RequestParam int pageSize , @RequestBody GetStuInfoParam param){
        log.info("API访问: code{} 访问了查询接口 关键字{}",code,param.getKeyWord());
        loginService.check(param.getToken());
        GetStuInfoResult stuInfo = getStuInfoService.getStuInfo(code, page, pageSize, param.getKeyWord());
        log.info("查询成功，返回{}条数据",stuInfo.getStudents().size());
        return CommonResult.success(stuInfo);
    }
}
