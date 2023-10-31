package service.impl;

import model.Student;
import repository.IStudentRepository;
import repository.impl.StudentRepository;
import service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    private static IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public boolean checkId(int id) {
        return iStudentRepository.checkId(id);
    }

    @Override
    public void addStudent(Student student) {
        iStudentRepository.addStudent(student);
    }

    @Override
    public void editStudent(Integer id, Student student) {
        iStudentRepository.editStudent(id, student);
    }

    @Override
    public List<Student> getAll() {
        return iStudentRepository.getAll();
    }

    @Override
    public Boolean removeStudent(int id) {
        Student student = iStudentRepository.findById(id);
        if (student == null){
            return false;
        }else {
            iStudentRepository.deleteById(id);
        }
        return true;
    }
}
