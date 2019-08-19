package dev.nardos.springmvc101.controllers;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class Mvc101ControllerTest {

    private MockMvc mockMvc;
    private Mvc101Controller mvc101Controller;

    @Before
    public void setup() {
        mvc101Controller = new Mvc101Controller();
        mockMvc = MockMvcBuilders.standaloneSetup(mvc101Controller).build();
    }

    @Test
    public void test_index_path() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }

    @Test
    public void test_courses_path() throws Exception {
        //mockMvc.perform(get("/courses"))
          //      .andExpect(status().isOk());
                //.andExpect(view().name("courses"));
    }
}
