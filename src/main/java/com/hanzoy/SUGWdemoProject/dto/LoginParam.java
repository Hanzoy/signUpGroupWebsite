package com.hanzoy.SUGWdemoProject.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;

@Data
public class LoginParam {

    @Pattern(regexp="^[a-zA-Z0-9_]{8}$", message = "不符合规范")
    @NotBlank(message = "不能为空")
    String username;

    @Pattern(regexp = "^[a-zA-Z0-9_]\\w{5,17}$", message = "不符合规范")
    @NotBlank(message = "不能为空")
    String password;
}
