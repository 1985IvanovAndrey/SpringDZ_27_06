package com.SpringHome.controller;

import com.SpringHome.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
@RequestMapping("/")

public class MainContoller {

    ArrayList<Student> studentsList = new ArrayList<>();


//    @RequestMapping(method = RequestMethod.GET)
//    public String allStudents(@ModelAttribute Student student) {
//        studentsList.add(new Student(1, "Kolya", "+380962514785", "MAN"));
//        studentsList.add(new Student(1, "Ronaldo", "+380965214785", "MAN"));
//        studentsList.add(new Student(1, "Vika", "+380962512485", "WOMAN"));
//        studentsList.add(new Student(1, "Kristin", "+380969914785", "WOMAN"));
//        studentsList.add(new Student(1, "Vovan", "+380962511185", "MAN"));
//        System.out.println(studentsList);
//        return "page/index";
//    }


    @RequestMapping(method = RequestMethod.GET)
    public String showPage(Model model) {
        model.addAttribute("studentsList", studentsList);
        return "page/index";
    }
        @RequestMapping(method = RequestMethod.GET)
    public String allStudents(@ModelAttribute Student student) {
        studentsList.add(new Student("1", "Kolya", "+380962514785", "MAN"));
        studentsList.add(new Student("2", "Ronaldo", "+380965214785", "MAN"));
        studentsList.add(new Student("3", "Vika", "+380962512485", "WOMAN"));
        studentsList.add(new Student("4", "Kristin", "+380969914785", "WOMAN"));
        studentsList.add(new Student("5", "Vovan", "+380962511185", "MAN"));
        System.out.println(studentsList);
            return "redirect:/";
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@ModelAttribute Student student) {
        System.out.printf(student.getId());
        System.out.printf(student.getName());
        System.out.printf(student.getPhone());
        System.out.printf(student.getSex());
        studentsList.add(new Student(student.getId(), student.getName(), student.getPhone(), student.getSex()));
        return "redirect:/";

        //    @RequestMapping(method = RequestMethod.GET)
//    public String showIndex(Model model) {
//        model.addAttribute("message", "  me first message in spring");
//        return "page/index";
//    }
//    @RequestMapping(value = "go", method = RequestMethod.GET)
//    public String show(Model model) {
//        model.addAttribute("message", " me first message in spring");
//        return "redirect:/show";
////    }
//    }
    }
}