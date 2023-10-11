package ss03_Array.Example;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongTungCotMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập m");
        int m = Integer.parseInt(input.nextLine());
        System.out.println("Nhập n");
        int n = Integer.parseInt(input.nextLine());
        int[][] array2D = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập phần tử tại "+(i+j)+" cho mảng: ");
                array2D[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        System.out.println("Dãy mảng mới nhập là: " + Arrays.deepToString(array2D));

        System.out.println("Nhập cột muốn tính tổng: ");
        int m1 = Integer.parseInt(input.nextLine());
        while (true){
            if (m1 < 0 || m1 > array2D.length){
                System.out.println("Nhập sai nhập lại.");
                System.out.println("Nhập cột muốn tính tổng: ");
                m1 = Integer.parseInt(input.nextLine());
            }else {
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < array2D[m1].length; i++) {
            sum += array2D[m1][i];
        }
        System.out.println("Tổng giá trị tại " + m1 + " là: " + sum);
    }
}
