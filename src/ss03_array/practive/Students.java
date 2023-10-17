package ss03_array.practive;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter a size: ");
            size = input.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        }while (size>30);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a mark for student " + (i+1)+ ": ");
            array[i] = input.nextInt();
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if (array[i] >= 5 && array[i] <=10){
                count++;
            }
        }
        System.out.print("\nThe number of students passing the exam is " + count);
    }
}
