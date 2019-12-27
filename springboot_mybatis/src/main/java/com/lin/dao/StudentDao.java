package com.lin.dao;


import com.lin.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface StudentDao {
    //增
     public int addStudent(Student student);
    //删
    public int deleteStudent(int id);
    //改
    public int updateStudent(Student student);
    //查
    public List<Student> queryAll();
}
