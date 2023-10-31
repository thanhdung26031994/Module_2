package repository;

import model.Student;

import java.util.List;

public interface IStudentRepository {
    boolean checkId(int id);

    void addStudent(Student student);

    void editStudent(Integer id, Student student);

    List<Student> getAll();

    Student findById(int id);

    void deleteById(int id);
}
