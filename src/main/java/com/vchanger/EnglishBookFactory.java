package com.vchanger;

import com.github.javafaker.Faker;

import java.util.Random;

public class EnglishBookFactory implements BookFactory{
    Faker faker = new Faker();
    @Override
    public Book createFictionBook() {
        return new EnglishFictionBook(faker.book().title(),faker.book().author());
    }

    @Override
    public Book createScientificBook() {
        Random random = new Random();
        String[] ar = {"Еextbook","Workbook","Problem book"};
        return new EnglishScientificBook(faker.book().title(),faker.educator().course(),ar[random.nextInt(2)],faker.book().author(),random.nextBoolean(),faker.university().name());
    }
}
