package com.kgc.sk.service.impl;

import com.kgc.sk.mapper.ClassesMapper;
import com.kgc.sk.mapper.StudentMapper;
import com.kgc.sk.pojo.Classes;
import com.kgc.sk.pojo.Student;
import com.kgc.sk.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudetnServiceImpl implements StudentService {
    @Resource
    StudentMapper studentMapper;
    @Resource
    ClassesMapper classesMapper;
    @Override
    public List<Student> selectAll() {
        List<Student> students = studentMapper.selectByExample(null);
        for (Student student : students) {
            System.out.println(student.getName());
            Classes classes = classesMapper.selectByPrimaryKey(student.getClassid());
            student.setClassname(classes.getName());
            System.out.println(classes.getName());
        }
        return students;
    }

    @Override
    public List<Classes> selectByName() {
        List<Classes> classes = classesMapper.selectByExample(null);
        return classes;
    }

    @Override
    public int add(Student student) {
        int i = studentMapper.insertSelective(student);
        return i;
    }
}
