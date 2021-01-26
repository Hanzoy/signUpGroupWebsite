package com.hanzoy.SUGWdemoProject.service;

import com.hanzoy.SUGWdemoProject.dto.GetStuInfoResult;

public interface GetStuInfoService {
    public GetStuInfoResult getAllStuInfo(int code, int page, int pageSize);

    public GetStuInfoResult getStuInfo(int code, int page, int pageSize, String keyWord);
}
