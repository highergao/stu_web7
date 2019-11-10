package com.mapper;

import com.entity.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StuMapper {

    @Select(" select * from t_student")
    public List<Student> studentList();
}
