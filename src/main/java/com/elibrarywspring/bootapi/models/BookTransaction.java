package com.elibrarywspring.bootapi.models;

public class BookTransaction {
    String bookTitle;
    String cardId;

    public BookTransaction(String bookTitle, String cardId){
        this.bookTitle = bookTitle;
        this.cardId = cardId;
    }

    public String toString(){
        return bookTitle + " " + cardId;
    }

}
