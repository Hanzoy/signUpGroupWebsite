package com.hanzoy.SUGWdemoProject.dto;

import com.hanzoy.SUGWdemoProject.domain.Student;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class PostStudentWillParam {

    @Pattern(regexp="^201[0-9]{5}|2020[0-9]{4}$", message = "不符合规范")
    @NotBlank(message = "不能为空")
    private String stdId;

    @Pattern(regexp = "^[\\u4E00-\\u9FA5A-Za-z0-9_]+$", message = "不符合规范")
    @NotBlank(message = "不能为空")
    private String stdName;

    @Pattern(regexp = "^[\\u4E00-\\u9FA5A-Za-z0-9_()]+$", message = "不符合规范")
    @NotBlank(message = "不能为空")
    private String major;

    @Pattern(regexp = "^[\\u4E00-\\u9FA5A-Za-z0-9_]+$", message = "不符合规范")
    @NotBlank(message = "不能为空")
    private String classNum;

    @Pattern(regexp = "^[0-9]*$", message = "不符合规范")
    @NotBlank(message = "不能为空")
    private String stdQQ;

    @Pattern(regexp = "^([1][3,4,5,6,7,8,9])\\d{9}$", message = "不符合规范")
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
        @Pattern(regexp = "^[\\u4E00-\\u9FA5A-Za-z0-9_]+$", message = "不符合规范")
        @NotBlank(message = "不能为空")
        private String organization;

        @Pattern(regexp = "^[\\u4E00-\\u9FA5A-Za-z0-9_]+$", message = "不符合规范")
        @NotBlank(message = "不能为空")
        private String branch;

        private String reason;

        public static Will CopyWill(com.hanzoy.SUGWdemoProject.domain.Will will){
            Will will1 = new Will();
            will1.setBranch(will.getBranch());
            will1.setOrganization(will.getOrganization());
            return will1;
        }
    }

    public PostStudentWillParam Copy(Student student){
        this.setStdId(student.getStuid());
        this.setStdName(student.getStdname());
        this.setClassNum(student.getClassnum());
        this.setStdQQ(student.getStdqq());
        this.setStdPhone(student.getStdphone());
        this.setIsDispensing(student.getIsdispensing());
        return this;
    }
}
