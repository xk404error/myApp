package com.xk.dao.mapper;

import com.xk.dao.model.StudentGradle;
import com.xk.dao.model.StudentGradleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface StudentGradleMapper {
    int countByExample(StudentGradleExample example);

    int deleteByExample(StudentGradleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudentGradle record);

    int insertSelective(StudentGradle record);

    List<StudentGradle> selectByExample(StudentGradleExample example);

    StudentGradle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudentGradle record, @Param("example") StudentGradleExample example);

    int updateByExample(@Param("record") StudentGradle record, @Param("example") StudentGradleExample example);

    int updateByPrimaryKeySelective(StudentGradle record);

    int updateByPrimaryKey(StudentGradle record);
}