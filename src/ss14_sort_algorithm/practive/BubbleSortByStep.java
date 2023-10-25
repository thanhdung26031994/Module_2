package ss14_sort_algorithm.practive;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter list size: ");
        int sizeList = Integer.parseInt(input.nextLine());
        int[] arrList = new int[sizeList];
        System.out.println("Enter " + arrList.length + " values:");
        for (int i = 0; i < arrList.length; i++) {
            arrList[i] = input.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < arrList.length; i++) {
            System.out.print(arrList[i] + "\n");
        }
        System.out.println(Arrays.toString(arrList));

    }
}
