package extra_exercises1.repository.impl;

import extra_exercises1.model.Student;
import extra_exercises1.repository.IStudentRepository;

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
}
