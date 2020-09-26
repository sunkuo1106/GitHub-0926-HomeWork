package com.kgc.service.impl;

import com.kgc.entity.Classes;
import com.kgc.mapper.ClassesMapper;
import com.kgc.service.ClassesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-26 15:31
 */
@Service("classesService")
public class ClassesServiceImpl implements ClassesService {
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

}
