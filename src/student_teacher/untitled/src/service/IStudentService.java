package service;

import model.Student;

import java.util.List;

public interface IStudentService {
    boolean checkId(int id);

    void addStudent(Student student);

    void editStudent(Integer id, Student student);

    List<Student> getAll();

    Boolean removeStudent(int id);
}
