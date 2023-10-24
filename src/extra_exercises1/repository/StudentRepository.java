package extra_exercises1.repository;


import extra_exercises1.model.Student;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    private static List students = new LinkedList();
    static {
        students.add(new Student(1,"Dụng", 5.7));
        students.add(new Student(2,"Tuấn", 8.4));
        students.add(new Student(3,"Vi",9.0));
        students.add(new Student(4,"Độ", 7.7));
        students.add(new Student(5,"Hải",6.7));
    }
    @Override
    public void showList() {
        for (Object s: students) {
            System.out.println(s);
        }
    }
    public void addStudent(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ID học viên: ");
        int addId = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên học viên: ");
        String addName = input.nextLine();
        System.out.println("Nhập điểm số: ");
        double addPoint = input.nextDouble();
        Student student = new Student(addId, addName, addPoint);
        students.add(student);
    }

    public void editStudent(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ID muốn sửa thông tin");
        int editId = Integer.parseInt(input.nextLine());
        for (int i = 0; i< students.size(); i++){
            if (students.get(i).equals(editId)){
                System.out.println("Nhập tên học sinh: ");
                String addName = input.nextLine();
                System.out.println("Nhập điểm học sinh: ");
                double addPoint = input.nextDouble();
                students.set(i, addName);
                students.set(i, addPoint);

            }
        }
    }
}
