package ss03_array.example;

import java.util.Scanner;

public class MangHaiChieu {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + "rows and " +
                matrix[0].length + " colums: ");
        //in mang
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
                System.out.print(matrix[row][column] + " ");

            }
            System.out.println();
        }

        //tong mang
        /*int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j];
            }
        }*/
        //System.out.println("tong cua mang la: " + total);

        //tong tung cot
        for (int i = 0; i < matrix[0].length; i++) {
            int total = 0;
            for (int j = 0; j < matrix.length; j++) {
                total += matrix[i][j];
            }
            System.out.println("Sum for column "+ i+ " is " + total);
        }

        //Dong co tong cac phan tu lon nhat
        int maxRow = 0;
        int indexOfMaxRow = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            maxRow += matrix[0][i];
        }
        for (int i = 1; i < matrix.length; i++) {
            int totalOfThisRow = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                totalOfThisRow += matrix[i][j];
            }
            if (totalOfThisRow > maxRow){
                maxRow = totalOfThisRow;
                indexOfMaxRow = i;
            }
        }
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);

        //xao tron mang
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int i1 = (int) (Math.random()*matrix.length);
                int j1 = (int) (Math.random()*matrix[i].length);

                //Swap matrix[i][j] thanh matrix[i1][j1]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = temp;
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}
