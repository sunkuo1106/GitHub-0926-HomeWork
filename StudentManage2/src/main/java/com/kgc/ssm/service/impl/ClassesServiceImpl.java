package com.kgc.ssm.service.impl;

import com.kgc.ssm.mapper.ClassesMapper;
import com.kgc.ssm.mapper.StudentMapper;
import com.kgc.ssm.pojo.Classes;
import com.kgc.ssm.pojo.ClassesExample;
import com.kgc.ssm.pojo.Student;
import com.kgc.ssm.service.ClassesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-26 15:31
 */
@Service("classesService")
public class ClassesServiceImpl implements ClassesService{
    @Resource
    ClassesMapper classesMapper;
    @Override
    public Classes cList(Integer id) {
        Classes classes = classesMapper.selectByPrimaryKey(id);
        return classes;
    }

    @Override
    public List<Classes> cList2() {

        return  classesMapper.selectByExample(null);
    }
//    @Resource
//    ClassesMapper classesMapper;
//    @Resource
//    StudentMapper studentMapper;
////    @Override
//    public Classes cList(Integer id) {
//        List<Student> students = studentMapper.selectByExample(null);
//
//
//        return ;
//    }
}
