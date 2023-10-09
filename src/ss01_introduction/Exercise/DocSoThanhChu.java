package ss01_introduction.Exercise;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Nhập số muốn chuyển đổi thành chữ: ");
        number = scanner.nextInt();
        String ketQua = docSoChuyenDoi(number); //gán
        System.out.println(ketQua);

    }

    public static String docSoChuyenDoi(int number) {
        String[] soToiMuoi = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String[] soToiHaiMuoi = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fiveteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"};
        String[] soChuc = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if (number <= 10) {
            return soToiMuoi[number];
        }
        if (number <= 20) {
            return soToiHaiMuoi[number - 10];
        }
        if (number <= 99) {
            return soChuc[number / 10] + " " + soToiMuoi[number % 10];
        }
        if (number <= 999) {
            return soToiMuoi[number / 100] + " hundred and " + docSoChuyenDoi(number % 100);
        }
        return "";
    }
}
