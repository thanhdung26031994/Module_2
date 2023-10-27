package extra_exercises1.view;

import extra_exercises1.controller.StudentController;
import extra_exercises1.model.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static extra_exercises2.views.MenuMain.inputId;

public class CodegymStudentMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentController studentController = new StudentController();
    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("---------Menu--------");
            System.out.println("1.Quản lý học sinh.");
            System.out.println("2.Quản lý giáo viên.");
            System.out.println("0.Thoát.");
            System.out.print("Nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    menuStudent();
                    break;
                case 2:
                    menuTeacher();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.print("Nhập sai. Vui lòng nhập lại: ");
            }
        }while (true);

    }

    private static void menuTeacher() {
    }

    private static void menuStudent() {
        String id;
        int choice;
        Student student;
        do {
            System.out.println("-----------Thông tin học sinh----------");
            System.out.println("1.Hiển thị danh sách học sinh.");
            System.out.println("2.Thêm học sinh");
            System.out.println("3.Sửa thông tin học sinh.");
            System.out.println("4.Xoá học sinh.");
            System.out.println("0.Thoát");
            System.out.print("Vui lòng chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    List<Student> students = studentController.getAll();
                    if (students.isEmpty()){
                        System.out.println("Không có học sinh nào.");
                    }else {
                        System.out.println("---------Danh Sách Học Sinh-----------");
                        for (Student s:students){
                            System.out.println(s);
                        }
                    }
                    break;
                case 2:
                    id = String.valueOf(inpuId());
                    student = inputInformatin(id);
                    student.setId(id);
                    studentController.addStudent(student);
                    System.out.println("Thêm sản phẩm thành công.");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.print("Nhập sai. Vui lòng nhập lại:");
            }
        }while (true);

    }


    private static Student inputInformatin(String id) {
        System.out.println("Nhập tên học sinh: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh (Năm-Tháng-Ngày): ");
        String dataStr = scanner.nextLine();
        LocalDate date = LocalDate.parse(dataStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Nhập giới tính: ");
        Boolean gender = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Nhập mã lớp:");
        String classRoom = scanner.nextLine();
        System.out.println("Nhập điểm: ");
        Double point = scanner.nextDouble();
        return new Student(name,date,gender,classRoom,point);
    }

    private static String inpuId() {
        System.out.print("Nhập mã học sinh: ");
        return String.valueOf(scanner.nextLine());
    }
}
