package cz.uhk.pro2.models;

public class Student extends Person{
    private int studentNumber;
    private int averageMark;
    public Student(String name, String phoneNumber, String emailAdress,int studentNumber,int averageMark) {
        super(name, phoneNumber, emailAdress);
        this.averageMark = averageMark;
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    public boolean isEligibleToEnrol(){
        return true;
    }
    public String []  getSeminarsTaken(){
        String marks [] ={} ;
        return marks;
    }
}
