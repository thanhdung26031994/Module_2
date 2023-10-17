package ss02_loop.practive;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = input.nextInt();
        System.out.println("Nhập b: ");
        b = input.nextInt();
        // Math.abs() giá trị tuyệt đối của số dương, của đối số
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có UCLN");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("UCLN là: " + a);
    }
}
