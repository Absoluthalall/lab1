package com.vchanger;

public class RussianFictionBook extends Book{
    String author;
    public RussianFictionBook(String name,String author){
        this.name=name;
        this.author=author;
    }
    @Override
    String getName() {
        return this.name+" "+this.author;
    }
}
