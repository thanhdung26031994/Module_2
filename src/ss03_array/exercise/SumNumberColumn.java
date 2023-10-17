package ss03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumNumberColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập cột m: ");
        int m = Integer.parseInt(input.nextLine());
        System.out.println("Nhập dòng n: ");
        int n = Integer.parseInt(input.nextLine());
        int[][] array2D = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập các phần tử trong mảng: ");
                array2D[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        System.out.println("Dãy mảng 2 chiều là: " + Arrays.deepToString(array2D));
        System.out.println();
        System.out.println("Nhập cột muốn tính tổng: ");
        int column = Integer.parseInt(input.nextLine());
        while (true){
            if (column < 0 || column > array2D.length){
                System.out.println("Nhập sai nhập lại.");
                System.out.println("Nhập cột muốn tính tổng: ");
                column = Integer.parseInt(input.nextLine());
            }else {
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < array2D.length; i++) {
            sum += array2D[i][column];
        }
        System.out.println("Tổng giá trị tại " + column + " là: " + sum);
    }
}
