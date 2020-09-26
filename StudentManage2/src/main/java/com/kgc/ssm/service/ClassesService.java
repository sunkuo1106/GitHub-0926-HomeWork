package com.kgc.ssm.service;

import com.kgc.ssm.pojo.Classes;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-26 15:31
 */
public interface ClassesService {
    Classes cList(Integer id);
    List<Classes> cList2();
}
