import view.StudentManager;

import java.util.Scanner;

public class Menu {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        int choice;
        int studentId;
        do {
            showMenu();
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    studentManager.editStudent();
                    break;
                case 3:
                    studentManager.deleteStudent();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    studentManager.show();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("invalid! please choose action in menu");
            }
        }while (true);
    }
    public static void showMenu(){
        System.out.println("-----------Menu---------");
        System.out.println("1. Add student");
        System.out.println("2. Edit student by id");
        System.out.println("3. Delete student by id");
        System.out.println("4. Sort student by gpa");
        System.out.println("5. Sort student by name");
        System.out.println("6. Show student");
        System.out.println("0. Exit");
        System.out.print("Please choose: ");
    }
}
