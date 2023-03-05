package com.myCrud.CrudOpr.controller;

import com.myCrud.CrudOpr.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.myCrud.CrudOpr.service.bookservices;

import java.util.List;

@RestController
public class booksController {
    @Autowired
    bookservices bookservice;
    @GetMapping("/book")
    public List<Books> getAllBooks()
    {
        return bookservices.getAllBooks();
    }
    @GetMapping("/book/{bookId}")
    private Books getBooks(@PathVariable("bookId") int bookId)
    {

        return bookservice.getBooks(bookId);
    }

    @DeleteMapping("/book/{bookId}")
    private void deleteBook(@PathVariable("bookId") int bookId)
    {
        bookservices.delete(bookId);
    }


    private int saveBook(@RequestBody Books books)
    {
        bookservices.saveOrUpdate(books);
        return books.getBookId();
    }

    @PutMapping("/book")
    private Books update(@RequestBody Books books)
    {
        bookservices.saveOrUpdate(books);
        return books;
    }

}
