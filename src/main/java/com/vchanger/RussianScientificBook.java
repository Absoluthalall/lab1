package com.vchanger;

public class RussianScientificBook extends Book{
    String discipline;
    String type;
    String author;
    public RussianScientificBook(String name, String discipline,String type,String author){
        this.name=name;
        this.author=author;
        this.discipline=discipline;
        this.type=type;
    }
    @Override
    String getName() {
        return this.type+" "+this.discipline+" "+this.name+" "+this.author;
    }
}
