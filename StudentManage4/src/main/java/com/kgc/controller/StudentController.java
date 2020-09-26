package com.kgc.controller;

import com.kgc.entity.Classes;
import com.kgc.entity.Student;
import com.kgc.service.ClassesService;
import com.kgc.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-26 15:22
 */
@Controller
public class StudentController {
    @Resource
    StudentService studentService;
    @Resource
    ClassesService classesService;
    @RequestMapping("/")
    public String index(HttpSession session){
        List<Student> students = studentService.stuList();
        session.setAttribute("students",students);
        return "index";
    }
    @RequestMapping("/toadd")
    public String toadd(HttpSession session,Integer id){
        List<Classes> classes = classesService.cList2();
        session.setAttribute("classes",classes);
        return "add";
    }
    @RequestMapping("/doadd")
    public String doadd(Student student){
        studentService.addStu(student);
        return "redirect:/";
    }
}
