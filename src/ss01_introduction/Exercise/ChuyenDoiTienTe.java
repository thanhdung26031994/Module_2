package ss01_introduction.Exercise;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tienVND =23000, tienUSD;
        System.out.println("Nhap so tien USD de chuyen doi VND: ");
        tienUSD = scanner.nextDouble();
        double daChuyenDoi = tienUSD*tienVND;
        System.out.println("So tien ban doi duoc la: " + daChuyenDoi);
    }
}
