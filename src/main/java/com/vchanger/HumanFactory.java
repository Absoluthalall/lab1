package com.vchanger;

import com.github.javafaker.Faker;

import java.util.Locale;

public class HumanFactory {
    public Human createHuman(HumanType type){
        Human human = null;
        Faker faker = new Faker(new Locale("ru"));
        switch (type){
            case STUDENT:

                human = new Student(faker.name().firstName()+" "+faker.name().lastName());
                break;
            case TEACHER:

                human = new Teacher(faker.name().nameWithMiddle());
                break;
        }
        return human;
    }
}
