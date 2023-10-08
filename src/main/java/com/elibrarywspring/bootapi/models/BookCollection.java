package com.elibrarywspring.bootapi.models;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private final List<Book> _books;

    public List<Book> getBooks(){
        return _books;
    }

    public BookCollection(List<Book> books){
           _books = new ArrayList<Book>();
           _books.addAll(books);
    }
}
