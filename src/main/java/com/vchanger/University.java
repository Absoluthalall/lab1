package com.vchanger;

import java.util.ArrayList;

import static com.vchanger.HumanType.STUDENT;
import static com.vchanger.HumanType.TEACHER;

public class University {
    ArrayList<Human> students = new ArrayList<>();
    ArrayList<Human> teachers = new ArrayList<>();
    public University(){
        HumanFactory humanFactory = new HumanFactory();
        for (int i = 0; i<15; i++){
            this.students.add(humanFactory.createHuman(STUDENT));
            this.teachers.add(humanFactory.createHuman(TEACHER));
        }
    }
    public ArrayList<Human> getStudents(){
        return this.students;
    }
    public ArrayList<Human> getTeachers(){
        return this.teachers;
    }
}
