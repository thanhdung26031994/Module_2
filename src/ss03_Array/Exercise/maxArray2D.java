package ss03_Array.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class maxArray2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài m: ");
        int m = Integer.parseInt(input.nextLine());
        System.out.println("Nhập độ dài n: ");
        int n = Integer.parseInt(input.nextLine());
        int[][] array2D = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập phần tử của mảng 2 chiều " + (i+j));
                array2D[i][j] = Integer.parseInt(input.nextLine());
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(array2D));
    }
}
