package ss02_Loop.Exercise;

import java.util.Scanner;

public class IntegersFirst20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numbers;
        System.out.println("Nhập số lượng số nguyên tố: ");
        numbers = input.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", numbers);
        int count = 0;
        int n = 2;
        while (count < numbers){
            if (isPrime(n)){
                System.out.print(n + " ");
                count++;
            }
            n++;
        }

    }
    public static boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        // check số nguyên tố  number >=2
        int result = (int)Math.sqrt(number);
        for (int i = 2; i <= result; i++) {
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }
}
