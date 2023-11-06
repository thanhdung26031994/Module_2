package case_study.views;

import case_study.controllers.CustomerController;
import case_study.controllers.EmployeeController;
import case_study.models.Customer;
import case_study.utils.Regex.RegexCustomer;
import case_study.utils.Regex.RegexEmployee;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CustomerView {
    private static final Scanner in  = new Scanner(System.in);

    private static final CustomerController customerController = new CustomerController();
    private static int choice;
    public static void CustomerManagement() {
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
                    displayCustomer();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    editCustomer();
                    break;
                case 4:
                    deleteCustomer();
                    break;
                case 5:
                    searchByNameCustomer();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Please choose the correct one");
            }
        }while (true);


    }

    private static void searchByNameCustomer() {
        String name = inputNameCus();
        if (customerController.checkName(name) == null) {
            System.out.println("Không có tên đang tìm.");
        }else {
            System.out.println(customerController.checkName(name));;
        }

    }

    private static void deleteCustomer() {
        System.out.print("Nhập id khách hàng để xoá: ");
        String id = in.nextLine().trim();
        if (customerController.checkIdCus(id)){
            customerController.removeById(id);
            System.out.println("Xoá thành công.");
        }else {
            System.out.println("Không thấy id cần xoá.");
        }
    }

    private static void editCustomer() {
        System.out.print("Nhập id khách hàng để sửa: ");
        String id = in.nextLine().trim();
        if (customerController.checkIdCus(id)){
            String name = inputNameCus();
            String birthday = inputBirthdayCus();
            String idCard = inputIdCardCus();
            String phone = inputPhoneCus();
            String email = inputEmailCus();
            String gender = inputGenderCus();
            String guest = inputGuestType();
            System.out.print("Nhập địa chỉ: ");
            String address = in.nextLine();
            customerController.editCustomerUp(id, new Customer(name, birthday, idCard, phone, email, gender, guest, address));
            System.out.println("Sửa thông tin thành công.");
        }else {
            System.out.println("Không tìm thấy id.");
        }
    }

    private static void displayCustomer() {
        customerController.getAll();
    }

    private static void addCustomer() {
        String id = inputIdCus();
        String name = inputNameCus();
        String birthday = inputBirthdayCus();
        String idCard = inputIdCardCus();
        String phoneNumber = inputPhoneCus();
        String email = inputEmailCus();
        String gender = inputGenderCus();
        String guestType = inputGuestType();
        System.out.print("Nhập địa chỉ của khách: ");
        String address = in.nextLine();
        customerController.addCustomer(new Customer(id, name, birthday, idCard,phoneNumber, email, gender,guestType, address));
    }

    private static String inputGuestType() {
        String guestType = null;
        boolean valid = false;

        while (!valid){
            System.out.print("Chọn loại khách hàng.\n" +
                    "1. Diamond\n" +
                    "2. Platinum\n" +
                    "3. Gold\n" +
                    "4. Silver\n" +
                    "5. Member\n");
            System.out.print("Vui lòng nhập: ");
            choice = Integer.parseInt(in.nextLine());
            switch (choice){
                case 1:
                    guestType = "Diamond";
                    valid = true;
                    break;
                case 2:
                    guestType = "Platinum";
                    valid = true;
                    break;
                case 3:
                    guestType = "Gold";
                    valid = true;
                    break;
                case 4:
                    guestType = "Silver";
                    valid = true;
                    break;
                case 5:
                    guestType = "Member";
                    valid = true;
                    break;
                default:
                    System.out.println("Vui lòng nhập đúng.");
            }
        }
        return guestType;
    }


    private static String inputGenderCus() {
        String gender = "";
        boolean valid = false;
        while (!valid) {
            System.out.print("Nhập giới tính (Nam, Nữ, LGBT): ");
            gender = in.nextLine().trim().toLowerCase();
            if (gender.equals("nam") || gender.equals("nữ") || gender.equals("lgbt")) {
                valid = true;
            } else {
                System.out.println("Giới tính không hợp lệ. Nhập lại.");
            }
        }
        return gender;
    }

    private static String inputEmailCus() {
        String email = null;
        boolean valid = false;
        while (!valid){
            System.out.print("Nhập email (abc@gmail.com): ");
            email = in.nextLine().trim();
            if (RegexCustomer.regexEmail(email)){
                valid = true;
            }else {
                System.out.println("Sai mẫu nhập lại.");
            }
        }
        return email;
    }

    private static String inputPhoneCus() {
        String phone = null;
        boolean valid = false;
        while (!valid){
            System.out.print("Nhập số điện thoại (từ 0 và đủ 10 số): ");
            phone = in.nextLine().trim();
            if (RegexCustomer.regexPhone(phone)){
                valid = true;
            }else {
                System.out.println("Vui lòng nhập lai.");
            }
        }
        return phone;
    }

    private static String inputIdCardCus() {
        String idCard = null;
        boolean valid = false;
        while (!valid){
            System.out.print("Nhập số CMND (từ 9-12 số): ");
            idCard = in.nextLine().trim();
            if (RegexCustomer.regexIdCard(idCard)){
                valid = true;
            }else {
                System.out.println("Vui lòng nhập lại.");
            }
        }
        return idCard;
    }

    private static String inputBirthdayCus() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String birthday = null;
        boolean valid = false;
        while (!valid){
            System.out.print("Nhập ngày sinh (mm/dd/YYYY): ");
            birthday = in.nextLine().trim();
            valid = EmployeeView.isValid(formatter, valid, birthday);
        }
        return birthday;
    }

    private static String inputNameCus() {
        String name = null;
        boolean valid = false;
        while (!valid){
            System.out.print("Nhập tên khách hàng: ");
            name = in.nextLine().trim();
            if (RegexCustomer.regexName(name)){
                valid = true;
            }else {
                System.out.println("Nhập tên viết hoa ký tự đầu.");
            }
        }
        return name;
    }

    private static String inputIdCus() {
        String id = null;
        boolean valid = false;
        while (!valid){
            System.out.print("Nhập id khách hàng (KH-xxxx): ");
            id = in.nextLine().trim();
            if (RegexCustomer.regexId(id)){
                if (customerController.checkIdCus(id)){
                    System.out.println("Đã có id khách hàng.");
                }else {
                    valid = true;
                }
            }else {
                System.out.println("Vui lòng nhập lại.");
            }
        }
        return id;
    }

}
