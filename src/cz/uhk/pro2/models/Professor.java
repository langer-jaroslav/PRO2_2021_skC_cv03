package cz.uhk.pro2.models;

public class Professor extends Person{
    private int salary;
    public Professor(String name, String phoneNumber, String emailAdress, int salary) {
        super(name, phoneNumber, emailAdress);
        this.salary = salary;
    }
}
