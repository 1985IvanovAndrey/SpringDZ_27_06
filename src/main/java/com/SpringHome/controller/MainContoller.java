package com.SpringHome.controller;

import com.SpringHome.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
@RequestMapping("/show")
public class MainContoller {

    ArrayList<Student> studentsList = new ArrayList<>();

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String showPage(Model model) {
   //     model.addAttribute("studentsList", studentsList);
//        if (studentsList==null) {
//            return "redirect:/all";
//        }else
//            return "page/index";
        return "redirect:/show/all";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String allStudents(@ModelAttribute Student student,Model model) {
        model.addAttribute("studentsList", studentsList);
        studentsList.add(new Student("1", "Kolya", "+380962514785", "MAN"));
        studentsList.add(new Student("2", "Ronaldo", "+380965214785", "MAN"));
        studentsList.add(new Student("3", "Vika", "+380962512485", "WOMAN"));
        studentsList.add(new Student("4", "Kristin", "+380969914785", "WOMAN"));
        studentsList.add(new Student("5", "Vovan", "+380962511185", "MAN"));
        return "page/index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(HttpServletRequest req,@ModelAttribute Student student) {
        studentsList.add(new Student(student.getId(), student.getName(), student.getPhone(), student.getSex()));
        return "redirect:/show/all";

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