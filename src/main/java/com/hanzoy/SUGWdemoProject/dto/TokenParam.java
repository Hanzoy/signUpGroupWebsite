package com.hanzoy.SUGWdemoProject.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;

@Data
public class TokenParam {

    @Pattern(regexp = "^[a-zA-Z0-9-_.]+$")
    @NotBlank(message = "不能为空")
    private String token;

}
