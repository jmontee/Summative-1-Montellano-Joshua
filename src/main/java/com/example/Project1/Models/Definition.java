package com.example.Project1.Models;

import java.util.Objects;

public class Definition {
    private Integer id;
    private String word;
    private String definition;

    public Integer getId() {
        return id;
    }

    public Definition setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getWord() {
        return word;
    }

    public Definition setWord(String word) {
        this.word = word;
        return this;
    }

    public String getDefinition() {
        return definition;
    }

    public Definition setDefinition(String definition) {
        this.definition = definition;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Definition that = (Definition) o;
        return Objects.equals(id, that.id) && Objects.equals(word, that.word) && Objects.equals(definition, that.definition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, word, definition);
    }
}
