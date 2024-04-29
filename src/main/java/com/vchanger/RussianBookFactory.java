package com.vchanger;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class RussianBookFactory implements BookFactory{
    Faker faker = new Faker(new Locale("ru"));
    @Override
    public Book createFictionBook() {
        return new RussianFictionBook(faker.book().title(),faker.book().author());
    }

    @Override
    public Book createScientificBook() {
        Random random = new Random();
        String[] ar = {"Учебник","Тетрадь","Задачник"};
        return new RussianScientificBook(faker.book().title(),faker.educator().course(),ar[random.nextInt(2)],faker.book().author());
    }
}
