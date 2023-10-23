package ss11_dsa_stack_queue.exercise.reverse_element;

import java.util.Arrays;
import java.util.Stack;

public class ReverseElement {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10};
        Stack<Integer> stack = new Stack<>();
        for (int i : intArr) {
            stack.push(i);
        }

        System.out.println(stack);
//        Cach 1
//        int index = 0;
//        while (!stack.isEmpty()){
//            intArr[index++] = stack.pop();
//        }
        //cach 2
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(intArr));
    }
}
