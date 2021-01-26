package com.hanzoy.SUGWdemoProject.dto;

import lombok.Data;

import java.util.List;

@Data
public class GetStuInfoResult {
    private int total;
    List<PostStudentWillParam> students;
}
