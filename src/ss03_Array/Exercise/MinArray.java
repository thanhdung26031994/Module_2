package ss03_Array.Exercise;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.println("Nhập số phần tử trong mảng: ");
            size = input.nextInt();
            if (size > 20){
                System.out.println("Vui lòng nhập đúng số phần tử nhỏ hơn 20");
            }
        }while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử tại " + (i+1) + " là:");
            array[i] = input.nextInt();
        }
        System.out.println();
        System.out.println("Dãy mảng mới nhập là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        int min = array[0];
        for (int i = 0; i < array.length;i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println();
        System.out.println("Giá trị nhỏ nhất của mảng là: " + min);
    }
}
