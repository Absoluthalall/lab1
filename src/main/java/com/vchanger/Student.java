package com.vchanger;

import java.util.ArrayList;

public class Student extends Human{
    public Student(String name){
        this.name=name;
    }
    @Override
    String getName() {
        return name;
    }

    @Override
    void takeBook(Book book) {
        this.books.add(book);
    }

    @Override
    ArrayList<Book> getBooks() {
        return this.books;
    }
}
