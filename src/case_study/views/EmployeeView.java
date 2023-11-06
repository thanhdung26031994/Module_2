package case_study.views;

import case_study.controllers.EmployeeController;
import case_study.models.Employee;
import case_study.utils.Regex.RegexEmployee;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeView {
    private static final Scanner in  = new Scanner(System.in);

    private static final EmployeeController employeeController = new EmployeeController();
    private static int choice;





    public static void EmployeeManagement() {
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
        if (employeeController.checkName(nameSearch) == null){
            System.out.println("Không có tên nhân viên.");
        }else {
            System.out.println("Thông tin bạn muốn tìm kiếm.");
            System.out.println(employeeController.checkName(nameSearch));
        }
    }

    private static void deleteEmployee() {
        System.out.print("Nhập id muốn xoá: ");
        String idDel = in.nextLine();
        if (employeeController.checkId(idDel)){
            System.out.println("Bạn chắc chắn muốn xoá: \n" +
                    "1.Vâng. \n" +
                    "2.Không.");
            System.out.print("Hãy lựa chọn: ");
            choice = Integer.parseInt(in.nextLine());
            switch (choice){
                case 1:
                    employeeController.deleteById(idDel);
                    System.out.println("Xoá thành công");
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Vui lòng chọn đúng.");
            }
        }else {
            System.out.println("Không có id muốn xoá.");
        }
    }

    private static void editEmployee() {
        System.out.print("Nhập mã nhân viên sửa: ");
        String id = in.nextLine();
        if (employeeController.checkId(id)){
            System.out.println("Chọn thông tin muốn sửa: \n" +
                    "1. Sửa tên.\n" +
                    "2. Sửa ngày sinh.\n"+
                    "3. Sửa số CMND.\n"+
                    "4. Sửa số điện thoại.\n"+
                    "5. Sửa email.\n"+
                    "6. Sửa giới tính.\n"+
                    "7. Sửa trình độ.\n"+
                    "8. Sửa vị trí.\n"+
                    "9. Sửa lương.\n"+
                    "0. Thoát");
            System.out.print("Vui lòng chọn: ");
            choice = Integer.parseInt(in.nextLine());
            switch (choice){
                case 1:
                    String nameUp = inputName();
                    employeeController.editName(id, nameUp);
                    System.out.println("Sửa tên thành công.");
                    break;
                case 2:
                    String birthdayUp = inputBirthday();
                    employeeController.editBirthday(id, birthdayUp);
                    System.out.println("Sửa ngày sinh thành công");
                    break;
                case 3:
                    String idCardUp = inputIdCard();
                    employeeController.editIdCardUp(id, idCardUp);
                    System.out.println(" thành công");
                    break;
                case 4:
                    String phoneNumberUp = inputPhone();
                    employeeController.editPhoneUp(id, phoneNumberUp);
                    System.out.println(" thành công");
                    break;
                case 5:
                    String emailUp = inputEmail();
                    employeeController.editEmailUp(id, emailUp);
                    System.out.println(" thành công");
                    break;
                case 6:
                    String genderUp = inputGender();
                    employeeController.editGenderUp(id, genderUp);
                    System.out.println("Sửa giới tính thành công");
                    break;
                case 7:
                    String positionUp = inputPosition();
                    employeeController.editPosition(id, positionUp);
                    System.out.println(" thành công");
                    break;
                case 8:
                    String levelUp = inputLevel();
                    employeeController.editLevel(id, levelUp);
                    System.out.println(" thành công");
                    break;
                case 9:
                    Double salaryUp = inputSalary();
                    employeeController.editSalary(id, salaryUp);
                    System.out.println(" thành công");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Vui lòng chọn đúng.");
            }
        }else {
            System.out.println("Không tìm thấy nhân viên với id: " + id);
        }
    }

    private static void displayEmployee() {
        System.out.println("------------Danh sách nhân viên-----------");
        employeeController.getAll();
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
        Double salary = inputSalary();
        employeeController.addEmployee(new Employee(id, name, birthday, idCard, phoneNumber,
                email, gender, position,level, salary));
    }
    private static Double inputSalary(){
        Double salary = null;
        boolean valid = false;
        while (!valid){
            try {
                System.out.print("Nhập lương (nghìn đồng): ");
                salary = Double.parseDouble(in.nextLine());
                if (salary > 0){
                    valid = true;
                }else {
                    System.out.println("Vui lòng nhập lại. Lương > 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số hợp lệ.");
            } catch (NullPointerException e) {
                System.out.println("Đã xảy ra lỗi. Vui lòng thử lại.");
            } catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
        return salary;
    }

    private static String inputLevel() {
        int choice;
        boolean valid = false;
        String level = null;
        do {
            System.out.println("Chọn chức vụ: \n" +
                    "1.Lễ tân.\n" +
                    "2.Phục vụ. \n" +
                    "3.Chuyên viên. \n" +
                    "4.Giám sát. \n" +
                    "5.Quản lý. \n" +
                    "6.Giám đốc \n");
            System.out.print("Vui lòng chọn: ");
            try {
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
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số hợp lệ.");
            } catch (Exception e){
                System.err.println(e.getMessage());
            }
        }while (!valid);
        return level;
    }

    private static String inputPosition() {
        int choice;
        boolean check = false;
        String position = null;
        do {
            System.out.println("Chọn trình độ.\n" +
                    "1.Trung cấp.\n" +
                    "2.Cao đẳng.\n" +
                    "3.Đại học.\n" +
                    "4.Sau đại học.\n");
            System.out.print("Vui lòng chọn: ");
            try {
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
            }catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số hợp lệ.");
            } catch (Exception e){
                System.err.println(e.getMessage());
            }
        }while (!check);
        return position;
    }

    private static String inputGender() {
        String gender = null;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Nhập giới tính (Nam, Nữ, LGBT): ");
                gender = in.nextLine().trim().toLowerCase();
                if (gender.equals("nam") || gender.equals("nữ") || gender.equals("lgbt")) {
                    valid = true;
                } else {
                    System.out.println("Giới tính không hợp lệ. Nhập lại.");
                }
            }catch (NullPointerException | IllegalStateException e) {
                System.out.println("Đã xảy ra lỗi. Vui lòng thử lại.");
                break;
            }
        }
        return gender;
    }

    private static String inputEmail() {
        String email = null;
        boolean valid = false;
        while (!valid){
            try {
                System.out.print("Nhập email (abc@gmail.com): ");
                email = in.nextLine();
                if (RegexEmployee.regexEmail(email)){
                    valid = true;
                }else {
                    System.out.println("Sai mẫu nhập lại.");
                }
            }catch (NullPointerException e) {
                System.out.println("Đã xảy ra lỗi. Vui lòng thử lại.");
            }catch (Exception e){
                System.err.println(e.getMessage());
            }

        }
        return email;
    }

    private static String inputPhone() {
        String phone = null;
        boolean valid = false;
        while (!valid){
            try {
                System.out.print("Nhập số điện thoại (từ 0 và đủ 10 số): ");
                phone = in.nextLine();
                if (RegexEmployee.regexPhone(phone)){
                    valid = true;
                }else {
                    System.out.println("Vui lòng nhập lai.");
                }
            }catch (NullPointerException e) {
                System.out.println("Đã xảy ra lỗi. Vui lòng thử lại.");
                break;
            } catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
        return phone;
    }

    private static String inputIdCard() {
        String idCard = null;
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
        String birthday = null;
        while (!valid) {
            System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
            birthday = in.nextLine();
            valid = isValid(formatter, valid, birthday);
        }
        return birthday;
    }

    static boolean isValid(DateTimeFormatter formatter, boolean valid, String birthday) {
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
        return valid;
    }

    private static String inputName() {
        String name = null;
        boolean valid = false;
        while (!valid){
            System.out.print("Nhập họ tên nhân viên: ");
            name = in.nextLine().trim();
            if (RegexEmployee.regexName(name)){
                valid = true;
            }else {
                System.out.println("Phải viết hoa kí tự đầu tiên của mỗi từ. Nhập lại");
            }
        }
        return name;
    }

    private static String inputId() {
        String id = null;
        boolean valid = false;
        while (!valid) {
            System.out.print("Nhập mã nhân viên: ");
            id = in.nextLine();
            if (RegexEmployee.regexId(id)) {
                if (employeeController.checkId(id)) {
                    System.out.println("Id đã tồn tại.");
                } else {
                    valid = true;
                }
            } else {
                System.out.println("Nhập lại theo mẫu NV-xxxx, xxxx là số.");
            }
        }
        return id;
    }

}
