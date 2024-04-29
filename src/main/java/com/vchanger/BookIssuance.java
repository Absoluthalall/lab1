package com.vchanger;

import java.util.ArrayList;
import java.util.Random;

public class BookIssuance {
    ArrayList<Human> humans = new ArrayList<>();
    public BookIssuance(University university, Library library){
        humans.addAll(university.getStudents());
        humans.addAll(university.getTeachers());
        Random random = new Random();
        for (Human human : humans){
            for (int i = 0;i<random.nextInt(8)+2;i++){
                if(!human.getBooks().contains(library.getBooks().get(random.nextInt(library.getBooks().size()-1)))){
                    human.takeBook((Book)library.getBooks().get(random.nextInt(library.getBooks().size()-1)));
                }else{
                    i--;
                }
            }
        }
    }
}
