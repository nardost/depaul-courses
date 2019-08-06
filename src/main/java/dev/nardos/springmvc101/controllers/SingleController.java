package dev.nardos.springmvc101.controllers;

import dev.nardos.springmvc101.model.Course;
import dev.nardos.springmvc101.services.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SingleController {


    @Autowired
    private CoursesService service;

    private CoursesService getService() {
        return this.service;
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/courses")
    public String courses(Model model) {
        List<Course> courses = getService().getAllCourses();
        if(courses != null && !courses.isEmpty()) {
            model.addAttribute("courses", courses);
        }
        return "courses";
    }

    @RequestMapping("/course/{id}")
    public String course(@PathVariable String id, Model model) {
        Course course = getService().getCourseById(id);
        model.addAttribute("catalogNumber", id);
        model.addAttribute("course", course);
        return "course";
    }
}
