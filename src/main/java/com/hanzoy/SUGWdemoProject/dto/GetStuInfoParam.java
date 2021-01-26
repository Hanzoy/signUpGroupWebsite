package com.hanzoy.SUGWdemoProject.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;

@Data
public class GetStuInfoParam {

    @Pattern(regexp = "^[a-zA-Z0-9-_.]+$")
    @NotBlank(message = "不能为空")
    private String token;

    @NotBlank(message = "不能为空")
    private String keyWord;
}
