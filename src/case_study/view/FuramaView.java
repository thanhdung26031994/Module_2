package case_study.view;

import case_study.controller.FuramaController;
import case_study.model.Employee;
import case_study.utils.RegexEmployee;
import case_study.utils.write_read.WriteAndReadFileEmployee;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FuramaView {
    private static final Scanner in  = new Scanner(System.in);

    private static FuramaController furamaController = new FuramaController();
    private static int choice;
    private static Employee employee;
    public static void displayMainMenu(){

        do {
            System.out.println("-----------Menu---------");
            System.out.println("1.Employee Management.");
            System.out.println("2.Customer Management.");
            System.out.println("3.Facility Management.");
            System.out.println("4.Booking Management.");
            System.out.println("5.Promotion Management.");
            System.out.println("6.Exit.");
            System.out.print("Please choose: ");
            choice = Integer.parseInt(in.nextLine());
            switch (choice){
                case 1:
                    EmployeeManagement();
                    break;
                case 2:
                    CustomerManagement();
                    break;
                case 3:
                    FacilityManagement();
                    break;
                case 4:
                    BookingManagement();
                    break;
                case 5:
                    PromotionManagement();
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("Please choose the correct one");
            }
        }while (true);


    }

    private static void PromotionManagement() {
        do {
            System.out.println("1.\tDisplay list customers use service\n" +
                                "2.\tDisplay list customers get voucher\n" +
                                "3.\tReturn main menu\n");
            System.out.print("Please choose: ");
            choice = Integer.parseInt(in.nextLine());
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("Please choose the correct one");
            }
        }while (true);
    }

    private static void BookingManagement() {
        do {
            System.out.println("1.\tAdd new booking\n" +
                                "2.\tDisplay list booking\n" +
                                "3.\tCreate new contracts\n" +
                                "4.\tDisplay list contracts\n" +
                                "5.\tEdit contracts\n" +
                                "6.\tReturn main menu\n");
            System.out.print("Please choose: ");
            choice = Integer.parseInt(in.nextLine());
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("Please choose the correct one");
            }
        }while (true);
    }

    private static void FacilityManagement() {
        do {
            System.out.println("1.Display list facility\n" +
                    "2.Add new facility\n" +
                    "3.Display list facility maintenance\n" +
                    "4.Delete facility\n" +
                    "5.Return main menu\n");
            System.out.print("Please choose: ");
            choice = Integer.parseInt(in.nextLine());
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(5);
                default:
                    System.out.println("Please choose the correct one");
            }
        }while (true);

    }

    private static void CustomerManagement() {
        do {
            System.out.println("1.Display list customers\n" +
                    "2.Add new customer\n" +
                    "3.Edit customer\n" +
                    "4.Delete customer\n" +
                    "5.Search by name customer\n" +
                    "6.Return main menu\n");
            System.out.print("Please choose: ");
            choice = Integer.parseInt(in.nextLine());
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("Please choose the correct one");
            }
        }while (true);


    }

    private static void EmployeeManagement() {
        do {
            System.out.println("-------Employee Management--------");
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee");
            System.out.println("4.Delete employee");
            System.out.println("5.Search by name employee");
            System.out.println("6.Return main menu");
            System.out.print("Please choose: ");
            choice = Integer.parseInt(in.nextLine());

            switch (choice){
                case 1:
                    displayEmployee();
                    break;
                case 2:
                    addEmployee();
                    break;
                case 3:
                    editEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    searchEmployee();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Please choose the correct one");
            }
        }while (true);

    }

    private static void searchEmployee() {
        String nameSearch = inputName();
        if (furamaController.checkName(nameSearch) == null){
            System.out.println("Không có tên nhân viên.");
        }else {
            System.out.println(furamaController.checkName(nameSearch));
        }
    }

    private static void deleteEmployee() {
        System.out.print("Nhập id muốn xoá: ");
        String idDel = in.nextLine();
        if (furamaController.checkId(idDel)){
            furamaController.deleteById(idDel);
            System.out.println("Xoá thành công");
        }else {
            System.out.println("Không có id muốn xoá.");
        }
    }

    private static void editEmployee() {
        System.out.print("Nhập mã nhân viên sửa: ");
        String id = in.nextLine();
        if (furamaController.checkId(id)){
            String nameUp = inputName();
            String birthdayUp = inputBirthday();
            String idCardUp = inputIdCard();
            String phoneNumberUp = inputPhone();
            String emailUp = inputEmail();
            String genderUp = inputGender();
            String positionUp = inputPosition();
            String levelUp = inputLevel();
            System.out.print("Nhập lương (nghìn đồng): ");
            Double salaryUp = Double.parseDouble(in.nextLine());
            furamaController.editEmployeeUp(id, new Employee(nameUp, birthdayUp, idCardUp, phoneNumberUp,
                    emailUp, genderUp, positionUp,levelUp, salaryUp));
        }else {
            System.out.println("Không có id thay đổi");
        }
    }

    private static void displayEmployee() {
        System.out.println("------------Danh sách nhân viên-----------");
        furamaController.getAll();
    }

    private static void addEmployee() {
        String id = inputId();
        String name = inputName();
        String birthday = inputBirthday();
        String idCard = inputIdCard();
        String phoneNumber = inputPhone();
        String email = inputEmail();
        String gender = inputGender();
        String position = inputPosition();
        String level = inputLevel();
        System.out.print("Nhập lương (nghìn đồng): ");
        Double salary = Double.parseDouble(in.nextLine());
        furamaController.addEmployee(new Employee(id, name, birthday, idCard, phoneNumber,
                email, gender, position,level, salary));
    }

    private static String inputLevel() {
        int choice;
        boolean valid = false;
        String level = "";
        do {
            System.out.println("Chọn chức vụ: \n" +
                    "1.Lễ tân.\n" +
                    "2.Phục vụ. \n" +
                    "3.Chuyên viên. \n" +
                    "4.Giám sát. \n" +
                    "5.Quản lý. \n" +
                    "6.Giám đốc \n");
            System.out.print("Vui lòng chọn: ");
            choice = Integer.parseInt(in.nextLine());
            switch (choice){
                case 1:

                    level = "Lễ tân";
                    valid = true;
                    break;
                case 2:

                    level = "Phục vụ";
                    valid = true;
                    break;
                case 3:

                    level = "Chuyên viên";
                    valid = true;
                    break;
                case 4:

                    level = "Giám sát";
                    valid = true;
                    break;
                case 5:

                    level = "Quản lý";
                    valid = true;
                    break;
                case 6:

                    level = "Giám đốc";
                    valid = true;
                    break;
                default:
                    System.out.println("Bạn chọn sai.");
                    break;
            }
        }while (!valid);
        return level;
    }

    private static String inputPosition() {
        int choice;
        boolean check = false;
        String position = "";
        do {
            System.out.println("Chọn trình độ.\n" +
                            "1.Trung cấp.\n" +
                            "2.Cao đẳng.\n" +
                            "3.Đại học.\n" +
                            "4.Sau đại học.\n");
            System.out.print("Vui lòng chọn: ");
            choice = Integer.parseInt(in.nextLine());
            switch (choice){
                case 1:
                    position = "Trung cấp";
                    check = true;
                    break;
                case 2:
                    position = "Cao đẳng";
                    check = true;
                    break;
                case 3:
                    position = "Đại học";

                    check = true;
                    break;
                case 4:
                    position = "Sau đại học";

                    check = true;
                    break;
                default:
                    System.out.println("Bạn chọn sai.");
                    break;
            }
        }while (!check);
        return position;
    }

    private static String inputGender() {
        String gender = "";
        boolean valid = false;
        while (!valid) {
            System.out.print("Nhập giới tính (nam, nữ, khác): ");
            gender = in.nextLine().trim().toLowerCase();
            if (gender.equals("nam") || gender.equals("nữ") || gender.equals("khác")) {
                valid = true;
            } else {
                System.out.println("Giới tính không hợp lệ. Nhập lại.");
            }
        }
        return gender;
    }

    private static String inputEmail() {
        String email = "";
        boolean valid = false;
        while (!valid){
            System.out.print("Nhập email (abc@gmail.com): ");
            email = in.nextLine();
            if (RegexEmployee.regexEmail(email)){
                valid = true;
            }else {
                System.out.println("Sai mẫu nhập lại.");
            }
        }
        return email;
    }

    private static String inputPhone() {
        String phone = "";

        boolean valid = false;
        while (!valid){
            System.out.print("Nhập số điện thoại (từ 0 và đủ 10 số): ");
            phone = in.nextLine();
            if (RegexEmployee.regexPhone(phone)){
                valid = true;
            }else {
                System.out.println("Vui lòng nhập lai.");
            }
        }
        return phone;
    }

    private static String inputIdCard() {
        String idCard = "";
        boolean valid = false;
        while (!valid){
            System.out.print("Nhập số CMND (từ 9-12 số): ");
            idCard = in.nextLine();
            if (RegexEmployee.regexIdCard(idCard)){
                valid = true;
            }else {
                System.out.println("Vui lòng nhập lại.");
            }
        }
        return idCard;
    }

    private static String inputBirthday() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        boolean valid = false;
        String birthday = "";
        while (!valid) {
            System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
            birthday = in.nextLine();
            try {
                LocalDate birthDate = LocalDate.parse(birthday, formatter);
                LocalDate today = LocalDate.now();
                Period age = Period.between(birthDate, today);
                if (age.getYears() >= 18) {
                    valid = true;
                    System.out.println("Bạn đã đủ 18 tuổi.");
                } else {
                    System.out.println("Bạn chưa đủ 18 tuổi. Nhập lại.");
                }
            } catch (Exception e) {
                System.out.println("Ngày sinh không hợp lệ. Nhập lại.");
            }
        }
        return birthday;
    }

    private static String inputName() {
        String name = "";
        boolean valid = false;
        while (!valid){
            System.out.print("Nhập họ tên nhân viên: ");
            name = in.nextLine();
            if (RegexEmployee.regexName(name)){
                valid = true;
            }else {
                System.out.println("Phải viết hoa kí tự đầu tiên của mỗi từ. Nhập lại");
            }
        }
        return name;
    }

    private static String inputId() {
        String id = "";
        boolean valid = false;
        while (!valid){
            do {
                System.out.print("Nhập mã nhân viên: ");
                id = in.nextLine();
                if (furamaController.checkId(id)){
                    System.out.println("Id đã tồn tại.");
                }
            }while (furamaController.checkId(id));

            if (RegexEmployee.regexId(id)){
                valid = true;
            }else {
                System.out.println("Nhập lại theo mẫu NV-xxxx, xxxx là số.");
            }
        }
        return id;
    }

}
