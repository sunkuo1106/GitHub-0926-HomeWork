package com.kgc.service.impl;

import com.kgc.mapper.ClassesMapper;
import com.kgc.mapper.StudentMapper;
import com.kgc.pojo.Classes;
import com.kgc.pojo.Student;
import com.kgc.pojo.StudentExample;
import com.kgc.service.ClassesService;
import com.kgc.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    ClassesService classesService;
    @Resource
    StudentMapper studentMapper;
    @Override
    public List<Student> select() {
        StudentExample studentExample=new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        List<Student> students = studentMapper.selectByExample(studentExample);
        for (Student student : students) {
            Classes classes = classesService.selectAll(student.getClassid());
            student.setClassname(classes.getName());
        }
        return students;
    }

    @Override
    public void addStu(Student student) {
        studentMapper.insertSelective(student);
    }
}
