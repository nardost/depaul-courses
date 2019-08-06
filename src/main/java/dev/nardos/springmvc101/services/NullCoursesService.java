package dev.nardos.springmvc101.services;

import dev.nardos.springmvc101.model.Course;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile(value = "null")
public class NullCoursesService implements CoursesService {
    @Override
    public List<Course> getAllCourses() {
        return null;
    }

    @Override
    public Course getCourseById(String id) {
        return null;
    }
}