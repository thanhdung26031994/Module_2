package ss13_search_algorithm.exercise;

import java.util.Scanner;

public class BinarySearch {
    public int binarySearch(int[] arr, int left, int right, int value){
        int mid;
        if (right >= left){
            mid = (left+right)/2;
            if (arr[mid] == value){
                return mid;
            }else if (arr[mid] > value){
                return binarySearch(arr, left, mid - 1, value);
            }else {
                return binarySearch(arr, mid + 1, right, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BinarySearch bs = new BinarySearch();
        int[] arr = {4, 8, 12, 18, 24, 34, 40, 42};
        int n = arr.length;
        System.out.println("Nhập phần tử muốn tìm: ");
        int value = Integer.parseInt(input.nextLine());
        int result = bs.binarySearch(arr, 0, n -1, value);
        if (result == -1){
            System.out.println("Phần tử không tồn tại trong mảng.");
        }else {
            System.out.println("Phần tử tại vị trí là: " + result);
        }
    }
}
