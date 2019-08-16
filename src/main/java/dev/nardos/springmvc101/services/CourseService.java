package dev.nardos.springmvc101.services;

import dev.nardos.springmvc101.model.Course;
import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    Course getCourseById(String id);
    Course saveCourse(Course course);
}
