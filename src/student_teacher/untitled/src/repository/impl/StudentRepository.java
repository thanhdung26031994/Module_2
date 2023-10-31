package repository.impl;

import model.Student;
import repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> students = new ArrayList<>();

    @Override
    public boolean checkId(int id) {
        for (Student s: students){
            if (s.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void addStudent(Student student) {

//        WriteReadStudent.write(students);
    }

    @Override
    public void editStudent(Integer id, Student student) {
        boolean isExisted = false;
        for (Student s: students){
            if (s.getId().equals(id)){
                isExisted = true;
                s.setName(student.getName());
                s.setYearOfBirth(student.getYearOfBirth());
                s.setAddress(student.getAddress());
                s.setGpa(student.getGpa());
                break;
            }
        }
        if (!isExisted){
            System.out.printf("Id = %d không tồn tại.\n", id);
        }else {
//            WriteReadStudent.write(students);
        }
    }

    @Override
    public List<Student> getAll() {
//        WriteReadStudent.write(students);
        return null;
    }

    @Override
    public Student findById(int id) {
        for (Student s: students){
            if (s.getId().equals(id)){
                return s;
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (Student s:students){
            if (s.getId().equals(id)){
                students.remove(id);
                break;
            }
        }
    }

}
