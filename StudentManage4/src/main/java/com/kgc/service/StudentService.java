package com.kgc.service;

import com.kgc.entity.Student;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-26 15:15
 */
public interface StudentService {
    List<Student> stuList();
    void addStu(Student student);

}
