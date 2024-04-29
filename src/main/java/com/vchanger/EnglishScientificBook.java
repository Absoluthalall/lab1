package com.vchanger;

public class EnglishScientificBook extends Book{
    String discipline;
    String type;
    String author;
    boolean master;
    String university;
    public EnglishScientificBook(String name, String discipline,String type,String author,boolean master,String university){
        this.name=name;
        this.author=author;
        this.discipline=discipline;
        this.type=type;
        this.master=master;
        this.university=university;
    }
    @Override
    String getName() {
        if (master) {
            return this.type + " " + this.discipline + " " + this.name + " " + this.author+" "+this.university+" for masters";
        } else {
            return this.type + " " + this.discipline + " " + this.name + " " + this.author+" "+this.university;
        }
    }
}
