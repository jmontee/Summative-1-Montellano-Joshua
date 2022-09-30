package com.example.Project1.Controllers;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(WordController.class)
public class WordControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnAWordAndDefinition1() throws Exception {
        mockMvc.perform(get("/word"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void shouldReturnAWordAndDefinition2() throws Exception {
        mockMvc.perform(get("/word"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void shouldReturnAWordAndDefinition3() throws Exception {
        mockMvc.perform(get("/word"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
