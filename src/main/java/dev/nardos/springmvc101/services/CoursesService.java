package dev.nardos.springmvc101.services;

import dev.nardos.springmvc101.model.Course;
import java.util.List;

public interface CoursesService {
    List<Course> getAllCourses();
    Course getCourseById(String id);
}
