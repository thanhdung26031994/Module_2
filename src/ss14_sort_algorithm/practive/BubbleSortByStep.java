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
        System.out.println("------------------");
        bubbleSortByStep(arrList);
    }

    public static void bubbleSortByStep(int[] arrList){
        int temp;
        boolean needNextPass = true;
        for (int i = 1; i < arrList.length; i++){
            needNextPass =false;
            for (int j = 0; j < arrList.length - i; j ++){
                if (arrList[j] > arrList[j + 1]){
                    System.out.println("Swap " + arrList[j] + " with " + arrList[j + 1]);
                    temp = arrList[j];
                    arrList[j] = arrList[j + 1];
                    arrList[j + 1] = temp;

                    needNextPass = true;
                }
            }

            if (!needNextPass){
                System.out.println("Mang da dc sap xep.");
                break;
            }
            System.out.print("List after the  " + i + "' sort: ");
            for (int j = 0; j < arrList.length; j++){
                System.out.print(arrList[j]+"\t");
            }
            System.out.println();
        }
    }
}
