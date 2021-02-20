package com.example.junkmongodb.Controller;

import com.example.junkmongodb.Entity.Book;
import com.example.junkmongodb.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public Collection<Book> getBooks(){
        return bookService.getBooks();
    }

    @PostMapping
    public Book postBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

}
