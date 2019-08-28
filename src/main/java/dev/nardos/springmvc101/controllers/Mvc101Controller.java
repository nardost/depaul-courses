package dev.nardos.springmvc101.controllers;

import dev.nardos.springmvc101.model.Course;
import dev.nardos.springmvc101.model.Student;
import dev.nardos.springmvc101.services.CourseService;
import dev.nardos.springmvc101.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class Mvc101Controller {


    @Autowired private CourseService courseService;

    @Autowired private StudentService studentService;

    private CourseService getCourseService() {
        return this.courseService;
    }

    private StudentService getStudentService() {
        return this.studentService;
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/courses")
    public String courses(Model model) {
        List<Course> courses = getCourseService().getAllCourses();
        if(courses != null && !courses.isEmpty()) {
            model.addAttribute("courses", courses);
            model.addAttribute("pageTitle", "Courses List");
        }
        return "courses";
    }

    @GetMapping("/course/{id}")
    public String course(@PathVariable String id, Model model) {
        Course course = getCourseService().getCourseById(id);
        model.addAttribute("catalogNumber", id);
        model.addAttribute("course", course);
        model.addAttribute("pageTitle", "Courses Detail");
        return "course";
    }

    @GetMapping("/course/create")
    public String createCourse(Model model) {
        model.addAttribute("course", new Course());
        model.addAttribute("pageTitle", "New Course Form");
        return "course-form";
    }

    @GetMapping("/course/update/{id}")
    public String updateCourse(@PathVariable String id, Model model) {
        model.addAttribute("course", getCourseService().getCourseById(id));
        model.addAttribute("pageTitle", "Course Update Form");
        model.addAttribute("idReadOnly", true);
        return "course-form";
    }

    @PostMapping("/course")
    public String saveCourse(@ModelAttribute Course course) {
        Course savedCourse = getCourseService().saveCourse(course);
        return "redirect:/course/" + savedCourse.getId();
    }

    @RequestMapping("/students")
    public String students(Model model) {
        List<Student> students = getStudentService().getAllStudents();
        model.addAttribute("students", students);
        model.addAttribute("pageTitle", "Students List");
        return "students";
    }
}
