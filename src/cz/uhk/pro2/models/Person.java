package cz.uhk.pro2.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    private String name;
    private String phoneNumber;
    private String emailAdress;
    private Adress adress;
    private List<Education> reachedEducation = new ArrayList<>();
    private List<CityPerson> list = new ArrayList<>();

    public Person(String name, String phoneNumber, String emailAdress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAdress = emailAdress;
    }
    public void purchaseParkingPass(){

    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
