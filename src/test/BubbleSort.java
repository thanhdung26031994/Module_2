package test;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int temp;
        boolean wapper;
        for (int i = 0; i < arr.length - 1; i++) {
            wapper = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                    wapper = true;
                }
            }
            if (!wapper){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
