package dev.nardos.springmvc101.controllers;

import dev.nardos.springmvc101.model.Course;
import dev.nardos.springmvc101.services.CourseService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class Mvc101ControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private Mvc101Controller mvc101Controller;

    @Mock
    private CourseService courseService;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
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

        when(courseService.getAllCourses()).thenReturn((List) courses);
        mockMvc.perform(get("/courses/")) /* the trailing / makes a difference!!! */
                .andExpect(status().isOk())
                .andExpect(view().name("courses"))
                .andExpect(model().attribute("courses", hasSize(3)));
    }
}
