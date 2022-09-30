package com.example.Project1.Models;

import java.util.Objects;

public class Answer {
    private Integer id;
    private String question;
    private String answer;

    public Integer getId() {
        return id;
    }

    public Answer setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getQuestion() {
        return question;
    }

    public Answer setQuestion(String question) {
        this.question = question;
        return this;
    }

    public String getAnswer() {
        return answer;
    }

    public Answer setAnswer(String answer) {
        this.answer = answer;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer1 = (Answer) o;
        return Objects.equals(id, answer1.id) && Objects.equals(question, answer1.question) && Objects.equals(answer, answer1.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, answer);
    }
}
