package com.kgc.tcmp077.wangyf.service.impl;

import com.kgc.tcmp077.wangyf.entity.student;
import com.kgc.tcmp077.wangyf.mapper.studentMapper;
import com.kgc.tcmp077.wangyf.service.StudentService;

import javax.annotation.Resource;
import javax.xml.ws.ServiceMode;
import java.util.List;

/**
 * @author wangyf
 * @create 2020-09-26 19:05
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    studentMapper studentMapper;

    @Override
    public List<student> getList() {
        List<student> students = studentMapper.selectByExample(null);
        return students;
    }

    @Override
    public int addStudent(student student) {
        int insert = studentMapper.insert(student);
        return 0;
    }
}
