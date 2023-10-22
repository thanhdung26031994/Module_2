package extra_exercises1.service;

import extra_exercises1.repository.IStudentRepository;
import extra_exercises1.repository.StudentRepository;

public class StudentService implements IStudentService{
    private IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public void showList() {
        iStudentRepository.showList();
    }
}
