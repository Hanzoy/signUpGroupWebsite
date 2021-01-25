package com.hanzoy.SUGWdemoProject.mapper;

import com.hanzoy.SUGWdemoProject.domain.Student;
import com.hanzoy.SUGWdemoProject.domain.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(@Param("stuid") String stuid, @Param("code") Integer code);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExampleWithBLOBs(StudentExample example);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(@Param("stuid") String stuid, @Param("code") Integer code);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExampleWithBLOBs(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKeyWithBLOBs(Student record);

    int updateByPrimaryKey(Student record);
}