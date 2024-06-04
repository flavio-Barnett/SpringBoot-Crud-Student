package com.example.taprogramacion2.service;

import com.example.taprogramacion2.model.entity.Student;

import java.util.List;

public interface IStudent {


    Student save (Student student);

    Student findById (Integer id);

    void deleteById (Student student);

    void deleteAll();

    List<Student> findAll();





}
