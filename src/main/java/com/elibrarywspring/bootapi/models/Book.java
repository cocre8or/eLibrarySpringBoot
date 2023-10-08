package com.elibrarywspring.bootapi.models;

public class Book {
    private final String title;

    public Book(String title){
        this.title = title;
    }
    public String toString(){
        return title;
    }
}
