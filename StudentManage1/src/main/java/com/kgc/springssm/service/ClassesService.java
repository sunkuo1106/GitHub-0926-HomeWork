package com.kgc.springssm.service;

import com.kgc.springssm.pojo.Classes;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-26 15:23
 */
public interface ClassesService {
    Classes classes(Integer id);
    List<Classes> selectAllClasses();
}
