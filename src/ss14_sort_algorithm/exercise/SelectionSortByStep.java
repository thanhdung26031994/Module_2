package ss14_sort_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortByStep {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Chiều dài mảng: ");
        int sizeList = Integer.parseInt(input.nextLine());
        double[] arrList = new double[sizeList];
        System.out.println("Vị trí " + arrList.length + " giá trị:");
        for (int i = 0; i < arrList.length; i++) {
            arrList[i] = input.nextDouble();
        }
        System.out.println("Danh sách mảng vừa nhập: ");
        for (int i = 0; i < arrList.length; i++) {
            System.out.print(arrList[i] + "\t");
        }
        System.out.println("------------------");
        selectionSort(arrList);
        for (int i = 0; i < arrList.length; i++)
            System.out.print(arrList[i] + " ");
    }

    public static void selectionSort(double[] list){
        double currentMin;
        int currentMinIndex;
        for (int i=0; i< list.length - 1; i++){
            currentMin = list[i];
            currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++){
                if (currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
