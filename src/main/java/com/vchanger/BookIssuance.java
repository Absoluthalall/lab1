package com.vchanger;

import java.util.ArrayList;
import java.util.Random;

public class BookIssuance {
    ArrayList<Human> humans = new ArrayList<>();
    Library library;
    public BookIssuance(University university, Library library) {
        humans.addAll(university.getStudents());
        humans.addAll(university.getTeachers());
        this.library=library;
    }
    public void Distribution(){
        Random random = new Random();
        for (Human human : humans){
            for (int i = 0;i<random.nextInt(8)+2;i++){
                if(!human.getBooks().contains(library.getBooks().get(random.nextInt(library.getBooks().size()-1)))){
                    human.takeBook(library.getBooks().get(random.nextInt(library.getBooks().size()-1)));
                }else{
                    i--;
                }
            }
        }
    }
}
