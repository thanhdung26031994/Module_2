package ss03_Array.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumDiagonalLine {
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
        int sum =0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (i == j){
                    sum += array2D[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo của mảng là " + sum);
    }
}
