package com.xk.test;

import com.alibaba.fastjson.JSONObject;
import com.xk.dao.model.StudentGradle;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TestController {
    @Resource
    TestDataSourceUrl testDataSourceUrl;
    @RequestMapping("/testData")
    public String testdatasource() {

        testDataSourceUrl.insertDate();
        for (StudentGradle studentGradle : testDataSourceUrl.query()) {
            String s = JSONObject.toJSONString(studentGradle);
            System.out.println(s);
        }
        return "1";
    }
}
