package com.lin.service;

import com.lin.entity.Student;

import java.util.List;

public interface StudentService {
    //增
    public int addStudent(Student student);
    //删
    public int deleteStudent(int id);
    //改
    public int updateStudent(Student student);
    //查
    public List<Student> queryAll();
}
