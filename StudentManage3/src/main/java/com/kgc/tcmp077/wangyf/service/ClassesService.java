package com.kgc.tcmp077.wangyf.service;

import com.kgc.tcmp077.wangyf.entity.classes;

import java.util.List;

/**
 * @author wangyf
 * @create 2020-09-26 19:13
 */
public interface ClassesService {
    classes classes(Integer id);
    List<classes> selectAllClasses();
}
