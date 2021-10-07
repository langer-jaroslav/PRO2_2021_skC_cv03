package cz.uhk.pro2;

import cz.uhk.pro2.models.Student;
import cz.uhk.pro2.models.file.CsvFileProvider;
import cz.uhk.pro2.models.file.FileOperations;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(
                new Student("Jan Novák",
                        "123 456 789",
                        "jan.novak@uhk.cz",
                        1,
                        2));
        students.add(
                new Student("Petr Novák",
                        "123 456 789",
                        "petr.novak@uhk.cz",
                        2,
                        3));

        FileOperations io = new CsvFileProvider();
        io.saveToFile(students);


        List<Student> newList = io.readFromFile();
        System.out.println("konec");
    }
}
