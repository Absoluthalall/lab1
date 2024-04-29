package com.vchanger;

public class EnglishFictionBook extends Book{
    String author;
    public EnglishFictionBook(String name,String author){
        this.name=name;
        this.author=author;
    }
    @Override
    String getName() {
        return this.name+this.author;
    }
}
