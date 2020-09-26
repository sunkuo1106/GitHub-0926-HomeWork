package com.kgc.tcmp077.wangyf.service;

import com.kgc.tcmp077.wangyf.entity.student;

import java.util.List;

/**
 * @author wangyf
 * @create 2020-09-26 19:05
 */
public interface StudentService {
    List<student> getList();
    int addStudent(student student);
}
