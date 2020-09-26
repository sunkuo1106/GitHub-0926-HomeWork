package com.kgc.service;

import com.kgc.pojo.Classes;

import java.util.List;

public interface ClassesService {
    Classes selectAll(Integer id);
    List<Classes> list2();
}
