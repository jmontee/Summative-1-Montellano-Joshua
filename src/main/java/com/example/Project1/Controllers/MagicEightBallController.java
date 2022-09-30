package com.example.Project1.Controllers;

import com.example.Project1.Models.Answer;
import com.example.Project1.Models.Question;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class MagicEightBallController {
    private List<String> response = new ArrayList<>();
    private List<Answer> answers = new ArrayList<>();
    private int id = 0;

    public MagicEightBallController(){
        response.add("Yes");
        response.add("No");
        response.add("Ask again later");
        response.add("Most definitely");
        response.add("I don't understand the question");
        response.add("Doubtful");
    }


    @PostMapping("/magic")
    @ResponseStatus(value = HttpStatus.OK)
    public Answer receiveAnswer(@RequestBody Question question){

        Random random = new Random();
        Answer newAnswer = new Answer();
        newAnswer.setQuestion(question.getQuestion());
        newAnswer.setId(id++);

        //This will get a random response between 0 and response.size() exclusive
        newAnswer.setAnswer(response.get(random.nextInt(response.size())));
        answers.add(newAnswer);
        return newAnswer;
    }

}
