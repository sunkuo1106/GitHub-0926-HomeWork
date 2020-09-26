package com.kgc.ssm.service.impl;

import com.kgc.ssm.mapper.ClassesMapper;
import com.kgc.ssm.mapper.StudentMapper;
import com.kgc.ssm.pojo.Classes;
import com.kgc.ssm.pojo.Student;
import com.kgc.ssm.pojo.StudentExample;
import com.kgc.ssm.service.ClassesService;
import com.kgc.ssm.service.StudentService;
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
