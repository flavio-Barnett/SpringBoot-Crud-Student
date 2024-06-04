package com.example.taprogramacion2.controller;

import com.example.taprogramacion2.model.entity.Student;
import com.example.taprogramacion2.service.IStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class StudentController {

    @Autowired
    IStudent studentService;

    @PostMapping("student")
    @ResponseStatus(HttpStatus.CREATED)
    public Student create(@RequestBody Student student){
        return studentService.save(student);
    }

    @GetMapping("students")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("student/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Student showById(@PathVariable Integer id) {
        return studentService.findById(id);
    }

    @DeleteMapping("student")
    @ResponseStatus(HttpStatus.OK)
    public void  deleteById(@RequestBody Student student){studentService.deleteById(student);}



}
