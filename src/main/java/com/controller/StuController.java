package com.controller;

import com.entity.Student;
import com.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StuController {

     StuController(){
        System.out.println("构造对象完成创建");
    }

    @Autowired
    StuService ss;

    @RequestMapping("/hello")
    public Map<String,String> hello(){
       Map<String,String> mm = new HashMap<>();
       mm.put("xxx","你好");
       return mm;
    }

    @RequestMapping("/stuList")
    public List<Student> studentList(){
       return ss.studentList();
    }
}
