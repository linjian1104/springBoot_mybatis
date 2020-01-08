package com.lin.controller;

import com.lin.entity.Student;
import com.lin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("query")
    public List<Student> queryAll(){
        return studentService.queryAll();
    }

    @RequestMapping("/getStudent")
    public List<Student> getStudent(int id){
        return studentService.getStudent(id);
    }

    @RequestMapping("/deleteStudent")
    public void deleteEmpt(int id){
        studentService.deleteStudent(id);
    }

}
