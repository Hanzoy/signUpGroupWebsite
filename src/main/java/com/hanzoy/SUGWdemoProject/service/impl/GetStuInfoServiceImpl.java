package com.hanzoy.SUGWdemoProject.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hanzoy.SUGWdemoProject.domain.Student;
import com.hanzoy.SUGWdemoProject.domain.StudentExample;
import com.hanzoy.SUGWdemoProject.domain.Will;
import com.hanzoy.SUGWdemoProject.domain.WillExample;
import com.hanzoy.SUGWdemoProject.dto.GetStuInfoResult;
import com.hanzoy.SUGWdemoProject.dto.PostStudentWillParam;
import com.hanzoy.SUGWdemoProject.mapper.MajorMapper;
import com.hanzoy.SUGWdemoProject.mapper.StudentMapper;
import com.hanzoy.SUGWdemoProject.mapper.WillMapper;
import com.hanzoy.SUGWdemoProject.service.GetStuInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GetStuInfoServiceImpl implements GetStuInfoService {

    @Resource
    StudentMapper studentMapper;
    @Resource
    WillMapper willMapper;
    @Resource
    MajorMapper majorMapper;
    @Override
    public GetStuInfoResult getAllStuInfo(int code, int page, int pageSize) {
        StudentExample studentExample = new StudentExample();
        studentExample.setOrderByClause("stuId ASC");
        Page<Object> objects = PageHelper.startPage(page, pageSize);
        studentExample.createCriteria().andCodeEqualTo(code);
        List<Student> students = studentMapper.selectByExampleWithBLOBs(studentExample);
        PageInfo<Student> pageInfo = new PageInfo<Student>(students);
        GetStuInfoResult getStuInfoResult = new GetStuInfoResult();
        getStuInfoResult.setTotal(pageInfo.getPages());
        List<PostStudentWillParam> list = new ArrayList<>();
        for (Student student : students) {
            PostStudentWillParam postStudentWillParam = new PostStudentWillParam();
            PostStudentWillParam.Will will = PostStudentWillParam.Will.CopyWill(willMapper.selectByPrimaryKey(student.getFirstwill()));
            will.setReason(student.getFirstreason());
            postStudentWillParam.setFirstWill(will);
            if(student.getSecondwill() != null){
                PostStudentWillParam.Will will1 = PostStudentWillParam.Will.CopyWill(willMapper.selectByPrimaryKey(student.getSecondwill()));
                will1.setReason(student.getSecondreason());
                postStudentWillParam.setSecondWill(will1);
            }
            postStudentWillParam.setMajor(majorMapper.selectByPrimaryKey(student.getMajor()).getMajorname());
            list.add(postStudentWillParam.Copy(student));
        }
        getStuInfoResult.setStudents(list);
        return getStuInfoResult;
    }

    @Override
    public GetStuInfoResult getStuInfo(int code, int page, int pageSize, String keyWord) {
        StudentExample studentExample = new StudentExample();
        studentExample.setOrderByClause("stuId ASC");
        Page<Object> objects = PageHelper.startPage(page, pageSize);
        studentExample.createCriteria().andCodeEqualTo(code).andStuidLike("%"+keyWord+"%");
        studentExample.or().andCodeEqualTo(code).andStdnameLike("%"+keyWord+"%");
        List<Student> students = studentMapper.selectByExampleWithBLOBs(studentExample);
        PageInfo<Student> pageInfo = new PageInfo<Student>(students);
        GetStuInfoResult getStuInfoResult = new GetStuInfoResult();
        getStuInfoResult.setTotal(pageInfo.getPages());
        List<PostStudentWillParam> list = new ArrayList<>();
        for (Student student : students) {
            PostStudentWillParam postStudentWillParam = new PostStudentWillParam();
            PostStudentWillParam.Will will = PostStudentWillParam.Will.CopyWill(willMapper.selectByPrimaryKey(student.getFirstwill()));
            will.setReason(student.getFirstreason());
            postStudentWillParam.setFirstWill(will);
            if(student.getSecondwill() != null){
                PostStudentWillParam.Will will1 = PostStudentWillParam.Will.CopyWill(willMapper.selectByPrimaryKey(student.getSecondwill()));
                will1.setReason(student.getSecondreason());
                postStudentWillParam.setSecondWill(will1);
            }
            postStudentWillParam.setMajor(majorMapper.selectByPrimaryKey(student.getMajor()).getMajorname());
            list.add(postStudentWillParam.Copy(student));
        }
        getStuInfoResult.setStudents(list);
        return getStuInfoResult;
    }
}
