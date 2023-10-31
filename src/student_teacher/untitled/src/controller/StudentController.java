package controller;

import model.Student;
import service.IStudentService;
import service.impl.StudentService;

import java.util.List;

public class StudentController {
    private static IStudentService iStudentService = new StudentService();

    public boolean checkId(int id) {
        return iStudentService.checkId(id);
    }

    public void addStudent(Student student) {
        iStudentService.addStudent(student);
    }

    public void editStudent(Integer id, Student student) {
        iStudentService.editStudent(id,student);
    }

    public List<Student> getAll() {
        return iStudentService.getAll();
    }

    public Boolean removeStudent(int id) {
        return iStudentService.removeStudent(id);
    }
}
