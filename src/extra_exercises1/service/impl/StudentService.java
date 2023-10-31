package extra_exercises1.service.impl;

import extra_exercises1.model.Student;
import extra_exercises1.repository.IStudentRepository;
import extra_exercises1.repository.impl.StudentRepository;
import extra_exercises1.service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    private static IStudentRepository studentRepository = new StudentRepository();
    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    @Override
    public boolean checkId(String id) {
        return studentRepository.checkId(id);
    }

    @Override
    public void editStudent(String id, Student student) {
        studentRepository.editStudent(id, student);
    }
}
