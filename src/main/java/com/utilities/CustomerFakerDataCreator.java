package com.utilities;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CustomerFakerDataCreator {

    Faker faker = new Faker();

    public String identificationNumberFromFaker() {
        return faker.bothify("?########?");
    }

    public String niptNumberForAlbanian() {
        return faker.bothify("?########?");
    }

    public String niptNumberForForeign() {
        return faker.bothify("?????####");
    }

    public String firstNameFromFaker() {
        return faker.name().firstName();
    }

    public String lastNameFromFaker() {
        return faker.name().lastName();
    }

    public String organizationNameFromFaker() {
        return faker.company().name();
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

    public String issuingDateFromFaker() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Faker faker = new Faker();
        String issueDate = sdf.format(faker.date().past(60, TimeUnit.DAYS));
        return issueDate;
    }

    public String invalidIssuingDateFromFaker() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Faker faker = new Faker();
        Date referenceDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(referenceDate);
        calendar.add(Calendar.MONTH, -3);
        return sdf.format(faker.date().past(60, TimeUnit.DAYS, calendar.getTime()));
    }
}
