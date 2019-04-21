package com.xk.test;

import com.alibaba.fastjson.JSONObject;
import com.xk.dao.mapper.StudentGradleMapper;
import com.xk.dao.model.StudentGradle;
import com.xk.dao.model.StudentGradleExample;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Component
public class TestDataSourceUrl {

    @Resource
    StudentGradleMapper studentGradleMapper;
    public void insertDate(){
        StudentGradle studentGradle = new StudentGradle();
        studentGradle.setGrade(80L);
        studentGradle.setCoursenName("math");
        studentGradle.setCoursenId(1);
        studentGradle.setStudentId(1);
        studentGradle.setStudentName("tes1");
        if(studentGradleMapper==null){
            return;
        }
        studentGradleMapper.insert(studentGradle);
    }

    public List<StudentGradle> query(){
        StudentGradleExample studentGradleExample = new StudentGradleExample();
        studentGradleExample.createCriteria();
        return studentGradleMapper.selectByExample(studentGradleExample);
    }

}
