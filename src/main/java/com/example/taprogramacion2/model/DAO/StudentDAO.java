package com.example.taprogramacion2.model.DAO;

import com.example.taprogramacion2.model.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDAO extends CrudRepository<Student,Integer> {

}
