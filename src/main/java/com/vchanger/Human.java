package com.vchanger;

import java.util.ArrayList;

abstract class Human {
    String name;
    ArrayList<Book> books = new ArrayList<>();
    abstract String getName();
    abstract void takeBook(Book book);
    abstract ArrayList<Book> getBooks();
}
