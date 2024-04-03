package com.utilities;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomerFakerDataCreator {

    Faker faker = new Faker();

    public String identificationNumberFromFaker() {
        return faker.bothify("?########?");
    }

    public String niptNumberFromFaker() {
        return faker.bothify("?########?");
    }

    public String firstNameFromFaker() {
        return faker.name().firstName();
    }

    public String lastNameFromFaker() {
        return faker.name().lastName();
    }

    public String emailFromFaker() {
        return faker.bothify("?????@GMAIL.COM");
    }

    public String phoneFromFaker() {
        return faker.bothify("6########");
    }

    public String birthDateFromFaker() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Faker faker = new Faker();
        return sdf.format(faker.date().birthday(18, 60));
    }
}
