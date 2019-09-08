package dev.nardos.springmvc101.services;

import dev.nardos.springmvc101.domain.Course;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile(value = "null")
public class CoursesServiceNullImpl implements CourseService {
    @Override
    public List<Course> getAllCourses() {
        return null;
    }

    @Override
    public Course getCourseById(String id) {
        return null;
    }

    @Override
    public Course saveCourse(Course course) {
        return null;
    }

    @Override
    public void deleteCourse(String id) {

    }
}
