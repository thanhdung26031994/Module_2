package ss02_Loop.Exercise;

import java.util.Scanner;

public class IntegersTo100 {
    public static boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        int result = (int)Math.sqrt(number);
        for (int i = 2; i <= result; i++) {
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Nhập các số nguyên tố nhỏ hơn 100: ");
        number = input.nextInt();
        for (int i = 0; i <= number; i++) {
            if (isPrime(i)){
                System.out.print(" " + i);
            }
        }
    }
}
