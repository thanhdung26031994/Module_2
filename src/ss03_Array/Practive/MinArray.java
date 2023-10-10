package ss03_Array.Practive;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        int[] arr;
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập số phần tử trong mảng:");
            size = input.nextInt();
            if (size > 20){
                System.out.println("Nhập quá 20 số phần tử");
            }
        }while (size>20);
        arr = new int[size];
        int i = 0;
        while (i< arr.length){
            System.out.println("Nhập phần tử " + (i+1) + " là: ");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.println("Danh sách mảng: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        int min = arr[0];
        int index = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min){
                min = arr[j];
                index = j + 1;
            }
        }
        System.out.println();
        System.out.println("Phần tử nhỏ nhất là " + min + " tại vị trí: " + index);

    }
}
