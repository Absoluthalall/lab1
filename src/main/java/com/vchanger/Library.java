package com.vchanger;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    public Library(){
        EnglishBookFactory englishBookFactory = new EnglishBookFactory();
        RussianBookFactory russianBookFactory = new RussianBookFactory();
        for(int i = 0;i<100;i++){
            books.add(englishBookFactory.createFictionBook());
            books.add(russianBookFactory.createFictionBook());
            books.add(englishBookFactory.createScientificBook());
            books.add(russianBookFactory.createScientificBook());
        }
    }
    public ArrayList getBooks(){
        return this.books;
    }
}
