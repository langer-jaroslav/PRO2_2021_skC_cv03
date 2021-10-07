package cz.uhk.pro2.models.file;

import cz.uhk.pro2.models.Student;

import java.util.List;

public interface FileOperations {
    void saveToFile(List<Student> students);
    List<Student> readFromFile();
}
