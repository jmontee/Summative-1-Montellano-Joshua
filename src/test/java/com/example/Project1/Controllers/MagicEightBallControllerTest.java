package com.example.Project1.Controllers;

import com.example.Project1.Models.Question;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MagicEightBallController.class)
public class MagicEightBallControllerTest {
    @Autowired
    private MockMvc mockMvc;
    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldReturnAnAnswerOnPostRequest1() throws Exception{
        Question question = new Question();
        question.setQuestion("Will this test pass?");
        String inputJson = mapper.writeValueAsString(question);

        mockMvc.perform(post("/magic")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
                ).andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void shouldReturnAnAnswerOnPostRequest2() throws Exception{
        Question question = new Question();
        question.setQuestion("Will this test fail?");
        String inputJson = mapper.writeValueAsString(question);

        mockMvc.perform(post("/magic")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
                ).andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void shouldReturnAnAnswerOnPostRequest3() throws Exception{
        Question question = new Question();
        question.setQuestion("Will I win the lottery?");
        String inputJson = mapper.writeValueAsString(question);

        mockMvc.perform(post("/magic")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
                ).andDo(print())
                .andExpect(status().isOk());
    }
}
