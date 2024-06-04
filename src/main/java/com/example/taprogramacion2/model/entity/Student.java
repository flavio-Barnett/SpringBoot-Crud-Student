package com.example.taprogramacion2.model.entity;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "estudiante")

public class Student implements Serializable {
    @Id
    @Column(name = "id_student")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStudent ;

    @Column(name = "name")
    private String name ;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private int age ;





}
