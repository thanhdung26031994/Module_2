package extra_exercises1.repository;

import extra_exercises1.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();

    void addStudent(Student student);

    boolean checkId(String id);

    void editStudent(String id, Student student);
}
