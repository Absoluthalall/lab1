package com.vchanger;

import java.util.ArrayList;

public class Teacher extends Human{

    public Teacher(String name){
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
        return books;
    }
}
