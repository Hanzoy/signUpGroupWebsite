package com.hanzoy.SUGWdemoProject.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
public class PostStudentWillParam {
    @NotBlank(message = "不能为空")
    private String stdId;

    @NotBlank(message = "不能为空")
    private String stdName;

    @NotBlank(message = "不能为空")
    private String major;

    @NotBlank(message = "不能为空")
    private String classNum;

    @NotBlank(message = "不能为空")
    private String stdQQ;

    @NotBlank(message = "不能为空")
    private String stdPhone;

    @Valid
    @NotNull(message = "不能为空")
    private Will firstWill;

    @Valid
    private Will secondWill;
    private Boolean isDispensing;


    @Data
    public static class Will{
        @NotBlank(message = "不能为空")
        private String organization;

        @NotBlank(message = "不能为空")
        private String branch;

        private String reason;
    }
}
