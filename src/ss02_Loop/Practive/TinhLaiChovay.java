package ss02_Loop.Practive;

import java.util.Scanner;

public class TinhLaiChovay {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số tiền gửi: ");
        money = scanner.nextDouble();

        System.out.println("Số tháng: ");
        month = scanner.nextInt();

        System.out.println("Lãi suất: ");
        interestRate = scanner.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Số tiền lãi là: " + totalInterest);
    }
}
