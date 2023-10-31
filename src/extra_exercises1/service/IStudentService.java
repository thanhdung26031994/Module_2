package extra_exercises1.service;

import extra_exercises1.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAll();

    void addStudent(Student student);

    boolean checkId(String id);

    void editStudent(String id, Student student);
}
