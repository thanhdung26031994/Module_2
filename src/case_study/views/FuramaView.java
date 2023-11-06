package case_study.views;

import case_study.controllers.EmployeeController;

import java.util.Scanner;

public class FuramaView {
    private static final Scanner in  = new Scanner(System.in);

    private static int choice;

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
                    EmployeeView.EmployeeManagement();
                    break;
                case 2:
                    CustomerView.CustomerManagement();
                    break;
                case 3:
                    FacilityView.FacilityManagement();
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

}
