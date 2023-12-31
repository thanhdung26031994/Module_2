package extra_exercises1.controller;

import extra_exercises1.model.Student;
import extra_exercises1.service.IStudentService;
import extra_exercises1.service.impl.StudentService;

import java.util.List;

public class StudentController {
    private final IStudentService iStudentService = new StudentService();
    public List<Student> getAll() {
        return iStudentService.getAll();
    }

    public void addStudent(Student student) {
        iStudentService.addStudent(student);

    }

    public boolean checkId(String id) {
        return iStudentService.checkId(id);
    }

    public void editStudent(String id, Student student) {
        iStudentService.editStudent(id, student);
    }
}
