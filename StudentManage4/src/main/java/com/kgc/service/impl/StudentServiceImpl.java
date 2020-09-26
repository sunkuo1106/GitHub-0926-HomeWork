package com.kgc.service.impl;

import com.kgc.entity.Classes;
import com.kgc.entity.Student;
import com.kgc.entity.StudentExample;
import com.kgc.mapper.StudentMapper;
import com.kgc.service.ClassesService;
import com.kgc.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-26 15:19
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    ClassesService classesService;
    @Resource
    StudentMapper studentMapper;
    @Override
    public List<Student> stuList() {
        StudentExample studentExample=new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        List<Student> students = studentMapper.selectByExample(studentExample);
        for (Student student : students) {
            Classes classes = classesService.cList(student.getClassid());
            student.setClassName(classes.getName());
        }
        return students;
    }

    @Override
    public void addStu(Student student) {
        studentMapper.insertSelective(student);
    }
}
