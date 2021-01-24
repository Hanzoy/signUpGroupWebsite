package com.hanzoy.SUGWdemoProject.mapper;

import com.hanzoy.SUGWdemoProject.domain.Will;
import com.hanzoy.SUGWdemoProject.domain.WillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WillMapper {
    long countByExample(WillExample example);

    int deleteByExample(WillExample example);

    int deleteByPrimaryKey(Integer willid);

    int insert(Will record);

    int insertSelective(Will record);

    List<Will> selectByExample(WillExample example);

    Will selectByPrimaryKey(Integer willid);

    int updateByExampleSelective(@Param("record") Will record, @Param("example") WillExample example);

    int updateByExample(@Param("record") Will record, @Param("example") WillExample example);

    int updateByPrimaryKeySelective(Will record);

    int updateByPrimaryKey(Will record);
}