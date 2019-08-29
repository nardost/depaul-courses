package dev.nardos.springmvc101.controllers;

import dev.nardos.springmvc101.model.Course;
import dev.nardos.springmvc101.services.CourseService;
import dev.nardos.springmvc101.services.StudentService;
import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(MockitoJUnitRunner.class)
public class Mvc101ControllerTest {

    private MockMvc mockMvc;

    @Mock private CourseService courseService;

    @Mock private StudentService studentService;

    @InjectMocks private Mvc101Controller mvc101Controller;


    @Before
    public void setup() {
        //MockitoAnnotations.initMocks(this); //either this or the @RunWith above
        mockMvc = MockMvcBuilders.standaloneSetup(mvc101Controller).build();
    }

    @Test
    public void testIndexPath() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }

    @Test
    public void testCoursesListPath() throws Exception {

        List<Course> courses = new ArrayList<>();
        courses.add(new Course());
        courses.add(new Course());
        courses.add(new Course());

        verifyZeroInteractions(courseService);

        when(courseService.getAllCourses()).thenReturn((List) courses);
        mockMvc.perform(get("/courses/")) /* the trailing / makes a difference!!! */
                .andExpect(status().isOk())
                .andExpect(view().name("courses"))
                .andExpect(model().attribute("courses", hasSize(3)));


        verifyZeroInteractions(studentService);

    }

    @Test
    public void testCourseCreatePath() throws Exception {
        mockMvc.perform(get("/course/create/"))
                .andExpect(status().isOk())
                .andExpect(view().name("course-form"))
                .andExpect(model().attribute("course", instanceOf(Course.class)))
                .andExpect(model().attribute("pageTitle", is("New Course Form")));
        verifyZeroInteractions(courseService);
    }
}
