package com.kgc.tcmp077.wangyf.mapper;

import com.kgc.tcmp077.wangyf.entity.student;
import com.kgc.tcmp077.wangyf.entity.studentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface studentMapper {
    int countByExample(studentExample example);

    int deleteByExample(studentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(student record);

    int insertSelective(student record);

    List<student> selectByExample(studentExample example);

    student selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") student record, @Param("example") studentExample example);

    int updateByExample(@Param("record") student record, @Param("example") studentExample example);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKey(student record);
}