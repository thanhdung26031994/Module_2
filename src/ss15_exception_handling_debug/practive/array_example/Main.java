package ss15_exception_handling_debug.practive.array_example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nVui lòng nhập số phần tử bất kì: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Nhập chỉ số " + x + " là: " + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá giới hạn của mảng.");
        }
    }
}
