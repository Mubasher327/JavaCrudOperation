package com.myCrud.CrudOpr.service;

import com.myCrud.CrudOpr.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myCrud.CrudOpr.repository.bookrepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class bookservices {

    @Autowired
    static
    bookrepository bookrepository1;
    public static List<Books> getAllBooks(){
        List <Books> books= new ArrayList<Books>();
        bookrepository1.findAll().forEach(books1 -> books.add(books1));
        return books;

    }

    public static void delete(int bookId) {
        bookrepository1.deleteById(bookId);
    }

    public Books getBooksById(int id)
    {
        return bookrepository1.findById(id).get();
    }


    public static void saveOrUpdate(Books books)
    {
        bookrepository1.save(books);
    }

//updating record
    public void update(Books books, int bookId)
    {
        bookrepository1.save(books);
    }

    public Books getBooks(int bookId) {

        return null;
    }
}
