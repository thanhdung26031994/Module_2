package ss03_Array.Exercise;

import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {

        int[] array = {3, 5, 4, 6, 8, 9, 10, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vị trí muốn chèn: ");
        int position = input.nextInt();
        if (position <= -1|| position >= array.length -1){
            System.out.println("Vị trí không có trong mảng.");
        }else {
            System.out.println("Nhập số muốn chèn: ");
            int num = input.nextInt();
            for (int i = array.length - 1; i > position ; i--) {
                array[i] = array[i - 1];
            }
            array[position] = num;

        }
        System.out.println("Mảng mới khi chèn phần tử: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

}
