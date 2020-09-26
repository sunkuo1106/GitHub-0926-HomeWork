package com.kgc.tcmp077.wangyf.controller;

import com.kgc.tcmp077.wangyf.entity.classes;
import com.kgc.tcmp077.wangyf.entity.student;
import com.kgc.tcmp077.wangyf.service.ClassesService;
import com.kgc.tcmp077.wangyf.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangyf
 * @create 2020-09-26 19:08
 */
public class StudentController {
    @Resource
    StudentService studentService;
    @Resource
    ClassesService classesService;

    @RequestMapping("/")
    public String toindex(Model model){
        List<student> students = studentService.selectAllStudent();
        model.addAttribute("students",students);
        return "index";
    }
    @RequestMapping("/toadd")
    public String toadd(Model model){
        List<classes> classes = classesService.selectAllClasses();
        model.addAttribute("classes",classes);
        return "add";
    }
    @RequestMapping("/doadd")
    public String doadd(student student, Model model){
        studentService.add(student);
        return "redirect:/";
    }
}
