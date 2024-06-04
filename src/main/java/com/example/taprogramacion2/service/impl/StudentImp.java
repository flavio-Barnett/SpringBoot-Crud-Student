package com.example.taprogramacion2.service.impl;


import com.example.taprogramacion2.model.DAO.StudentDAO;
import com.example.taprogramacion2.model.entity.Student;
import com.example.taprogramacion2.service.IStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentImp implements IStudent {

    @Autowired
    private StudentDAO studentDAO;

    @Transactional
    @Override
    public Student save(Student studentDao) {
        return studentDAO.save(studentDao);

    }

    @Transactional(readOnly = true)
    @Override
    public Student findById(Integer id) {
        return studentDAO.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void deleteById(Student student) {
    studentDAO.delete(student);
    }


    @Override
    public void deleteAll() {

    }

    @Override
    public List<Student> findAll() {

        return (List<Student>) studentDAO.findAll();
    }
}
