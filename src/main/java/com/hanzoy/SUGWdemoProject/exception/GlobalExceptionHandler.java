package com.hanzoy.SUGWdemoProject.exception;

import com.hanzoy.SUGWdemoProject.dto.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ResponseBody
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public CommonResult handleValidException(MethodArgumentNotValidException e){
        BindingResult bindingResult = e.getBindingResult();
        String message = null;
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            if (fieldError != null) {
                message = fieldError.getField()+fieldError.getDefaultMessage();
            }
        }
        return CommonResult.validateFailed(message);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public CommonResult handleHttpMessageNotReadableException(HttpMessageNotReadableException e){
        return CommonResult.validateFailed("请求参数解析异常");
    }

    @ExceptionHandler(FieldDoesNotExistException.class)
    public CommonResult handleFieldDoesNotExistException(FieldDoesNotExistException e){
        return CommonResult.validateFailed(e.getMessage());
    }

    @ExceptionHandler(UserAccountPasswordErrorException.class)
    public CommonResult handleUserAccountPasswordErrorException(UserAccountPasswordErrorException e){
        return CommonResult.accountPasswordError(e.getMessage());
    }

    @ExceptionHandler(TokenErrorException.class)
    public CommonResult handleTokenErrorException(TokenErrorException e){
        return CommonResult.tokenError(e.getMessage());
    }
}
