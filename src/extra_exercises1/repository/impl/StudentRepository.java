package extra_exercises1.repository.impl;

import extra_exercises1.model.Student;
import extra_exercises1.repository.IStudentRepository;
import extra_exercises1.utils.write_read_file.WriteStudent;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> students = new ArrayList<>();
    static {
        students.add(new Student("HV01","Hải", LocalDate.of(1999,12,16),true, "C0823G1", 8.6));
        students.add(new Student("HV02","Bảo", LocalDate.of(2000,11,15),null, "C0823G1", 9.2));
        students.add(new Student("HV03","Lâm", LocalDate.of(2001,10,14),false, "C0823G1", 4.9));
        students.add(new Student("HV04","Giàu", LocalDate.of(2002,9,13),true, "C0823G1", 6.3));
        students.add(new Student("HV05","Thái Bảo", LocalDate.of(1997,8,12),false, "C0823G1", 5.1));
    }
    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void addStudent(Student student) {

        WriteStudent.writeToFile(student);
    }

    @Override
    public boolean checkId(String id) {
        for (Student s: students){
            if (s.getId().toLowerCase().contains(id.toLowerCase())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void editStudent(String id, Student student) {
        for (Student s: students){
            if (s.getId().toLowerCase().contains(id.toLowerCase())){
                s.setName(student.getName());
                s.setDate(student.getDate());
                s.setGender(student.getGender());
                s.setClassRoom(student.getClassRoom());
                s.setPoint(student.getPoint());
                break;
            }
        }
    }
}
