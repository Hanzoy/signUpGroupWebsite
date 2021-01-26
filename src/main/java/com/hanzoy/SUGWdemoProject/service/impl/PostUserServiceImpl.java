package com.hanzoy.SUGWdemoProject.service.impl;

import com.hanzoy.SUGWdemoProject.domain.*;
import com.hanzoy.SUGWdemoProject.dto.PostStudentWillParam;
import com.hanzoy.SUGWdemoProject.exception.FieldDoesNotExistException;
import com.hanzoy.SUGWdemoProject.mapper.MajorMapper;
import com.hanzoy.SUGWdemoProject.mapper.StudentMapper;
import com.hanzoy.SUGWdemoProject.mapper.WillMapper;
import com.hanzoy.SUGWdemoProject.service.PostUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class PostUserServiceImpl implements PostUserService {

    @Resource
    private StudentMapper studentMapper;
    @Resource
    private MajorMapper majorMapper;
    @Resource
    private WillMapper willMapper;

    @Transactional
    @Override
    public void save(int code, PostStudentWillParam param) {
        Student student = new Student();
        student.setCode(code);
        student.setStuid(param.getStdId());
        student.setStdname(param.getStdName());
        MajorExample majorExample = new MajorExample();
        majorExample.createCriteria().andMajornameEqualTo(param.getMajor());
        List<Major> majors = majorMapper.selectByExample(majorExample);
        if (majors.isEmpty()){
            throw new FieldDoesNotExistException("majors不存在");
        }
        student.setMajor(majors.get(0).getMajorid());
        student.setClassnum(param.getClassNum());
        student.setStdqq(param.getStdQQ());
        student.setStdphone(param.getStdPhone());
        WillExample willExample = new WillExample();
        willExample.createCriteria().andOrganizationEqualTo(param.getFirstWill().getOrganization()).andBranchEqualTo(param.getFirstWill().getBranch());
        List<Will> wills = willMapper.selectByExample(willExample);
        if(wills.isEmpty()){
            throw new FieldDoesNotExistException("firstWill不存在");
        }
        student.setFirstwill(wills.get(0).getWillid());
        if(param.getSecondWill() != null){
            willExample = new WillExample();
            willExample.createCriteria().andOrganizationEqualTo(param.getSecondWill().getOrganization()).andBranchEqualTo(param.getSecondWill().getBranch());
            wills = willMapper.selectByExample(willExample);
            if(wills.isEmpty()){
                throw new FieldDoesNotExistException("secondWill不存在");
            }
            student.setSecondwill(wills.get(0).getWillid());
            student.setSecondreason(param.getSecondWill().getReason());
        }
        student.setFirstreason(param.getFirstWill().getReason());
        student.setIsdispensing(param.getIsDispensing());
        if(studentMapper.selectByPrimaryKey(student.getStuid(), student.getCode()) != null){
            studentMapper.updateByPrimaryKeyWithBLOBs(student);
            log.info("数据库: student表更新："+student);
        }else {
            studentMapper.insert(student);
            log.info("数据库: student表插入："+student);
        }
    }
}
