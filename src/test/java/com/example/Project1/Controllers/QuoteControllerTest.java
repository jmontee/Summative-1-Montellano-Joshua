package com.example.Project1.Controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(QuoteController.class)
public class QuoteControllerTest {

    @Autowired
    private MockMvc mockMvc;



    @Test
    public void shouldReturnAQuoteTest1() throws Exception{
        mockMvc.perform(get("/quote"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void shouldReturnAQuoteTest2() throws Exception{
        mockMvc.perform(get("/quote"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void shouldReturnAQuoteTest3() throws Exception{
        mockMvc.perform(get("/quote"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
