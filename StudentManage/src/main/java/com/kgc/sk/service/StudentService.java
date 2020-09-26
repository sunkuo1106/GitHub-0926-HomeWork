package com.kgc.sk.service;

import com.kgc.sk.pojo.Classes;
import com.kgc.sk.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student>selectAll();
    List<Classes>selectByName();
    int add(Student student);
}
