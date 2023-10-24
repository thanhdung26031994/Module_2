package extra_exercises1.controller;

import extra_exercises1.service.IStudentService;
import extra_exercises1.service.StudentService;

public class StudentController {
    private IStudentService iStudentService = new StudentService();
    public void showList(){
        iStudentService.showList();
    }
    public void addStudent(){
        iStudentService.addStudent();
    }
}
