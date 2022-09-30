package com.example.Project1.Models;

import java.util.Objects;

public class Quote {
    private Integer id;
    private String author;
    private String quote;

    public Integer getId() {
        return id;
    }

    public Quote setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Quote setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getQuote() {
        return quote;
    }

    public Quote setQuote(String quote) {
        this.quote = quote;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quote quote1 = (Quote) o;
        return Objects.equals(id, quote1.id) && Objects.equals(author, quote1.author) && Objects.equals(quote, quote1.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, quote);
    }
}
