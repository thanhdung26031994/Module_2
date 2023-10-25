package ss14_sort_algorithm.practive;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12, 18, 17};

    public static void bubbleSort(int[] list){
        boolean needNextPass = true;
        int temp;
        for (int i = 0; i <list.length && needNextPass; i++){
            needNextPass = false;
            for (int j = list.length - 1;  j > i; j--) {
                if (list[j] < list[j - 1]){
                    temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;

                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
    }
}
