package view;

import controller.StudentController;
import model.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private static Scanner scanner = new Scanner(System.in);

    private static StudentController studentController = new StudentController();

    public void addStudent(){
        int id = inputId();
        Student student = inputInformation();
        student.setId(id);
        studentController.addStudent(student);
        System.out.println("Thêm học sinh thành công");
    }

    private static Student inputInformation() {
        System.out.println("Nhập tên học sinh: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh (Năm-Tháng-Ngày): ");
        String dataStr = scanner.nextLine();
        LocalDate yearOfBirth = LocalDate.parse(dataStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Nhập đia chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        Float gpa = scanner.nextFloat();
        scanner.nextLine();

        return new Student(name, yearOfBirth, address, gpa);

    }

    private static Integer inputId() {
        int id;
        do {
            System.out.println("Nhập id sản phẩm: ");
            id = Integer.parseInt(scanner.nextLine());
            if (studentController.checkId(id)){
                System.out.println("ID đã tồn tại.");
            }
        }while (studentController.checkId(id));
        return id;
    }

    public void editStudent() {
        System.out.println("Nhập id muốn thay đổi: ");
        Integer id = Integer.parseInt(scanner.nextLine());
        if (studentController.checkId(id)) {
            System.out.println("Nhập tên học sinh: ");
            String name = scanner.nextLine();
            System.out.println("Nhập ngày sinh (Năm-Tháng-Ngày): ");
            String dataStr = scanner.nextLine();
            LocalDate yearOfBirth = LocalDate.parse(dataStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            System.out.println("Địa chỉ: ");
            String address = scanner.nextLine();
            Float gpa = inputGpa();
            scanner.nextLine();
            studentController.editStudent(id, new Student(name, yearOfBirth, address, gpa));
            System.out.println("Sửa thông tin thành công.");
        }else {
            System.out.printf("Id = %d không tồn tại.\n", id);
        }
    }
    public void show(){
        List<Student> students = studentController.getAll();
        if (students.isEmpty()){
            System.out.println("Không có học sinh nào.");
        }else {
            System.out.println("--------------Danh sách học sinh-------------");
            for (Student student: students){
                System.out.println(student);
            }
        }
    }

    public void deleteStudent(){
        int id = inputId();
        Boolean isSuccess = studentController.removeStudent(id);
        if (isSuccess){
            System.out.println("Xoá thành công.");
        }else {
            System.out.println("Không tìm thấy id.");
        }
    }
    private float inputGpa() {
        System.out.print("Nhập điểm TB: ");
        while (true) {
            try {
                float gpa = Float.parseFloat((scanner.nextLine()));
                if (gpa < 0.0 && gpa > 10.0) {
                    throw new NumberFormatException();
                }
                return gpa;
            } catch (NumberFormatException ex) {
                    System.out.print("Không đúng! Vui lòng nhập lại điểm học sinh: ");
            }
        }
    }
}
