package test;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Test {
    public static int[] solution(int[] a){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int height : a){
            if (height != -1){
                priorityQueue.add(height);
            }
        }
        for (int i = 0; i < a.length; i++){
            if (a[i] != -1){
                a[i] = priorityQueue.poll();
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {160, -1, 150, 170, -1, -1, 180, 190};
        solution(a);
        System.out.println(Arrays.toString(a));
    }
}
