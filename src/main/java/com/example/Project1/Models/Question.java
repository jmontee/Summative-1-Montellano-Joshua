package com.example.Project1.Models;

import java.util.Objects;

public class Question {
    private String question;

    public String getQuestion() {
        return question;
    }

    public Question setQuestion(String question) {
        this.question = question;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return Objects.equals(question, question1.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question);
    }
}
