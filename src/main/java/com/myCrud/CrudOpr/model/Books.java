package com.myCrud.CrudOpr.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Books {
    @Id
    @Column
    private int bookId;
    @Column
    private String bookName;
    @Column
    private String auther;
//getter
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuther() {
        return auther;
    }
//setters
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

}
