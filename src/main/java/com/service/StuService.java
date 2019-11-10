package com.service;

import com.entity.Student;
import com.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuService {

    @Autowired
    StuMapper sm;

    public List<Student> studentList() {
        return sm.studentList();
    }
}
