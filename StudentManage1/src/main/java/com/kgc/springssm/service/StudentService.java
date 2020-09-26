package com.kgc.springssm.service;

import com.kgc.springssm.pojo.Student;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-26 15:23
 */
public interface StudentService {
    List<Student> selectAllStudent();
    void add(Student student);
}
