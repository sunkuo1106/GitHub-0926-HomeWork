package com.kgc.service.impl;

import com.kgc.mapper.ClassesMapper;
import com.kgc.pojo.Classes;
import com.kgc.service.ClassesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("classesService")
public class ClassesServiceImpl implements ClassesService {
    @Resource
    ClassesMapper classesMapper;
    @Override
    public Classes selectAll(Integer id) {
        Classes classes = classesMapper.selectByPrimaryKey(id);
        return classes;
    }

    @Override
    public List<Classes> list2() {

        return  classesMapper.selectByExample(null);
    }

}
