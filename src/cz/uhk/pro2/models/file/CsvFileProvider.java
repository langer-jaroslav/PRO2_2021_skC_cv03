package cz.uhk.pro2.models.file;

import cz.uhk.pro2.models.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileProvider implements FileOperations{
    private String file = "";

    public CsvFileProvider(){
        file = "./persons.csv";
    }

    @Override
    public void saveToFile(List<Student> students) {
        try{
            FileWriter writer = new FileWriter(file);
            for (Student item: students) {
                String row = item.getName() + ";" + item.getPhoneNumber() + ";" + item.getEmailAdress() + "\n";
                writer.write(row);
            }
            writer.flush();
            writer.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Student> readFromFile() {
        ArrayList<Student> students = new ArrayList<>();

        try{

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine())!=null){
                String[] cols = line.split(";");
                Student student = new Student(cols[0], cols[1], cols[2], 1, 1);
                students.add(student);
            }

        }catch (IOException e){
            e.printStackTrace();
        }


        return students;
    }
}
