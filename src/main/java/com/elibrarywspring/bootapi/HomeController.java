package com.elibrarywspring.bootapi;

import com.elibrarywspring.bootapi.models.Book;
import com.elibrarywspring.bootapi.models.BookCollection;
import com.elibrarywspring.bootapi.models.BookTransaction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {
    @GetMapping(path="/")
    public String welcome(){
        return "Welcome to eLibrary with Spring Boot";
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping(value = "/v1/books")
    public List<BookCollection> getBooks(){
        //todo: this will come from a repo
        return List.of(new BookCollection(List.of(new Book("Testing1"), new Book("Testing2"))));
    }

    @PostMapping(value = "/v1/user")
    public ResponseEntity<Object> addUser(){
        //add user to the system
        return new ResponseEntity<>("To do",HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/v1/user")
    public ResponseEntity<Object> getUser(){
        //add user to the system
        return new ResponseEntity<>("To do",HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/v1/login")
    public ResponseEntity<Object> login(){
        //add user to the system
        return new ResponseEntity<>("To do",HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/v1/checkin")
    public ResponseEntity<Object>
        checkin(@RequestBody BookTransaction bookTransaction){
        //add user to the system
        return new ResponseEntity<>("To do",HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/v1/checkout")
    public ResponseEntity<Object>
        checkout(@RequestBody BookTransaction bookTransaction){
        //add user to the system
        return new ResponseEntity<>("To do",HttpStatus.ACCEPTED);
    }
}
