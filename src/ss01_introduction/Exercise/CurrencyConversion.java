package ss01_introduction.Exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tyLe =23000;
        System.out.println("Nhap so tien USD de chuyen doi VND: ");
        double moneyUSD = scanner.nextDouble();
        double moneyVND = moneyUSD*tyLe;
        System.out.println("So tien ban doi duoc la: " + moneyVND);
    }
}
