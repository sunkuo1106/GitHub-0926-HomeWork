package com.kgc.tcmp077.wangyf.service.impl;

import com.kgc.tcmp077.wangyf.entity.classes;
import com.kgc.tcmp077.wangyf.service.ClassesService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangyf
 * @create 2020-09-26 19:11
 */
@Service("classesService")
public class ClassesServiceimpl implements ClassesService {
    @Resource
    classesMapper classesMapper;

    @Override
    public classes classes(Integer id) {
        classes classes = classesMapper.selectByPrimaryKey(id);
        return classes;
    }

    @Override
    public List<classes> selectAllClasses() {
        List<classes> classes = classesMapper.selectByExample(null);
        return classes;
    }
}
