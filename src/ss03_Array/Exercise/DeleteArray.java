package ss03_Array.Exercise;

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr;
        int size;
        do {
            System.out.println("Nhập số lượng phần tử: ");
            size = input.nextInt();
            if (size > 50){
                System.out.println("Nhập số phần tử dưới 50.");
            }
        }while (size > 50);
        arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phân tử " + (i + 1) + " là: ");
            arr[i] = input.nextInt();
        }
        System.out.println("Dãy mảng mới nhập là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("Nhập phần tử cần xoá trong mảng là: ");
        int index_del = input.nextInt();
        int locationToDelete = selectionArray(arr, index_del);
        if (locationToDelete == -1){
            System.out.println("Phần tử không ở trong mảng.");
        }else {
            arr = deleteElement(arr, locationToDelete);
        }
        System.out.println("Mảng mới khi xoá phần tử là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int selectionArray(int[] arr, int index){
        int location = -1;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == index){
                location = i;
            }
        }
        return location;
    }
    public static int[] deleteElement(int[] arr, int location){
        int[] arr1 = new int[arr.length - 1];
        for (int i = 0; i < location; i++) {
            arr1[i] = arr[i];
        }
        for (int i = location + 1; i < arr.length ; i++) {
            arr1[i-1] = arr[i];
        }
        return arr1;
    }

}
