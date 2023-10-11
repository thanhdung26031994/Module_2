package ss03_Array.Exercise;

import java.util.Scanner;

public class CountStringCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        char character;
        int count = 0;
        System.out.println("Nhập chuổi bất kì: ");
        str = input.nextLine();
        System.out.println("Nhập kí tự muốn đếm: ");
        character = input.nextLine().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + character+ " trong chuỗi " + str+ " bằng " + count);
    }
}
