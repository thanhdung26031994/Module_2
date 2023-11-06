package case_study.views;

import case_study.controllers.FacilityController;
import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.utils.Regex.RegexFacility;

import java.util.Scanner;

public class FacilityView {
    private static final Scanner IN = new Scanner(System.in);
    private static final FacilityController facilityController = new FacilityController();
    private static Integer choice;

    public static void FacilityManagement() {
        do {
            System.out.println("1.Display list facility\n" +
                    "2.Add new facility\n" +
                    "3.Display list facility maintenance\n" +
                    "4.Delete facility\n" +
                    "5.Return main menu\n");
            System.out.print("Please choose: ");
            choice = Integer.parseInt(IN.nextLine());
            switch (choice) {
                case 1:
                    displayFacility();
                    break;
                case 2:
                    addNewFacility();
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
        } while (true);

    }

    private static void displayFacility() {
        facilityController.getAll();
    }

    private static void addNewFacility() {

        do {
            System.out.print("Add new facility:\n" +
                    "1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n");
            System.out.print("Please choose: ");
            choice = Integer.parseInt(IN.nextLine());
            switch (choice) {
                case 1:
                    addVilla();
                    break;
                case 2:
                    addHouse();
                    break;
                case 3:
                    addRoom();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Please choose the correct one.");
            }
        } while (true);
    }

    private static void addRoom() {
        Facility facility = informationFacility();
        System.out.println("Dịch vụ miễn phí đi kèm: ");
        String includedServiceFree = IN.nextLine();
        Facility facility1 = new Room(includedServiceFree);
        facilityController.addFacility(facility1,facility);
    }

    private static void addHouse() {
        Facility facility = informationFacility();
        System.out.println("Nhập tiêu chuẩn phòng: ");
        String standardsRoom = IN.nextLine().trim();
        System.out.print("Số tầng: ");
        Integer floorsOfNumber = Integer.parseInt(IN.nextLine().trim());
        Facility facility1 = new House(standardsRoom, floorsOfNumber);
        facilityController.addFacility(facility1, facility);
    }

    public static Facility informationFacility() {
        String code = inputCode();
        String serviceName = inputName();
        Float acreage = inputAcreage();
        Double costs = inputCosts();
        Integer maxPeople = inputMaxPeople();
        String typeRental = inputType();
        return new Facility(code, serviceName, acreage, costs, maxPeople, typeRental);
    }

    private static String inputType() {
        String typeRental = null;
        boolean valid = false;
        while (!valid){
            System.out.print("Kiểu thuê(năm, tháng, ngày, giờ): ");
            typeRental = IN.nextLine().trim().toLowerCase();
            if (typeRental.equals("năm") || typeRental.equals("tháng") || typeRental.equals("ngày") || typeRental.equals("giờ")){
                valid = true;
            }else {
                System.out.println("Vui lòng nhập đúng.");
            }
        }
        return typeRental;
    }

    private static Integer inputMaxPeople() {
        Integer max = null;
        boolean valid = false;
        while (!valid){
            System.out.print("Số lượng người tối đa: ");
            max = Integer.parseInt(IN.nextLine().trim());
            if (max > 0 && max < 20){
                valid =true;
            }else {
                System.out.println("Số lượng người tối đa phải >0 và nhỏ hơn <20.");
            }
        }
        return max;
    }

    private static Double inputCosts() {
        Double costs = null;
        boolean valid = false;
         while (!valid){
            System.out.print("Chi phí thuê: ");
            costs = Double.parseDouble(IN.nextLine().trim());
            if (costs > 0){
                valid = true;
            }else {
                System.out.println("Vui lòng nhập đúng.");
            }
         }
         return costs;
    }

    private static Float inputAcreage() {
        Float acreage = null;
        boolean valid = false;
        while (!valid){
            System.out.print("Diện tích sử dụng (m2): ");
            acreage = Float.parseFloat(IN.nextLine().trim());
            if (acreage > 30){
                valid = true;
            }else {
                System.out.println("Nhập sai nhập lại.");
            }
        }
        return acreage;
    }

    private static String inputName() {
        String name = null;
        boolean valid = false;
        while (!valid){
            System.out.print("Nhập tên dịch vụ: ");
            name = IN.nextLine().trim();
            if (RegexFacility.regexName(name)){
                valid = true;
            }else {
                System.out.println("Vui lòng viết hoa kí tự đầu.");
            }
        }
        return name;
    }

    private static String inputCode() {
        String code = null;
        boolean valid = false;
        while (!valid){
            System.out.print("Nhập mã dịch vụ: ");
            code = IN.nextLine().trim();
            if (RegexFacility.regexCode(code)){
//                if (facilityController.checkCode(code)){
//
//                }else {
//                    System.out.println("Mã dịch vụ đã bị trùng.");
//                }
                valid = true;
            }else {
                System.out.println("-\tMã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là:\n" +
                        "+ Nếu là Villa thì XX sẽ là VL\n" +
                        "+ Nếu là House thì XX sẽ là HO\n" +
                        "+ Nếu Room thì XX sẽ là RO\n");
            }
        }
        return code;
    }
    private static void addVilla() {
        Facility facility = informationFacility();
        System.out.print("Tiêu chuẩn phòng: ");
        String standardsRoom = IN.nextLine().trim();
        System.out.print("Diện tích hồ bơi: ");
        Float areaPoolSwimming = Float.parseFloat(IN.nextLine().trim());
        System.out.print("Số tầng: ");
        Integer floorsOfNumber = Integer.parseInt(IN.nextLine().trim());
        Facility facility1 = new Villa(standardsRoom,floorsOfNumber,areaPoolSwimming);
        facilityController.addFacility(facility1, facility);
    }
}