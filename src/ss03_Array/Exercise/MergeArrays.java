package ss03_Array.Exercise;

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập phần tử vào mảng tại " + (i+1)+" là: ");
            arr1[i] = input.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập phần tử vào mảng tại " + (i+1)+" là: ");
            arr2[i] = input.nextInt();
        }
        System.out.println();
        System.out.println("Mảng arr1 là: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();
        System.out.println("Mảng arr2 là: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
        int[] arr = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length + i] = arr2[i];
        }
        System.out.println();
        System.out.println("Mảng gọp là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
