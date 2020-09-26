package com.kgc.sk.controller;

import com.kgc.sk.pojo.Classes;
import com.kgc.sk.pojo.Student;
import com.kgc.sk.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {
    @Resource
    StudentService studentService;
    @RequestMapping("/index")
    @ResponseBody
    public Map<String,Object> index(){
        Map<String,Object> map=new HashMap<>();
        List<Student> students = studentService.selectAll();
        for (Student student : students) {
            System.out.println(student.getClassname());
        }
        System.out.println(students);
        map.put("students",students);
        return map;
    }

    @RequestMapping("/toadd")
    public String toadd(){
        return "add";
    }

    @RequestMapping("/byname")
    @ResponseBody
    public Map<String,Object> byname(){
        Map<String,Object> map=new HashMap<>();
        List<Classes> classes = studentService.selectByName();
        map.put("classes",classes);
        return map;
    }
    @RequestMapping("/add")
    @ResponseBody
    public Map<String,Object> add(Student student){
        Map<String,Object> map=new HashMap<>();
        int add = studentService.add(student);
        if(add!=0){
            map.put("status","ok");
        }else{
            map.put("status","no");
        }
        return map;
    }


}
