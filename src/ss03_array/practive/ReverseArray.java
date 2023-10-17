package ss03_array.practive;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        //nhap, kiem tra kich thuoc mang
        do {
            System.out.print("Enter a size: ");
            size = input.nextInt();
            if (size>20){
                System.out.println("Size does not exceed 20");
            }
        }while (size>20);
        //nhap gia tri cho cac phan tu
        array = new int[size];
        int i=0;
        while (i< array.length){
            System.out.println("Enter element " + (i +1)+": ");
            array[i] = input.nextInt();
            i++;
        }
        //in ra mang da nhap
        System.out.printf("%-20s%s", "Element is array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        //su dung bien trung gian hoan dao 2 phan tu
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        //in mang da dc dao nguoc
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
