package ss11_dsa_stack_queue.exercise.reverse_element;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStringElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        System.out.println("Nhập chuổi muốn đổi ngược: ");
        str = input.nextLine();
        String[] mWord = str.split("");
        Stack<String> wStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            wStack.push(mWord[i]);
        }
        int index = 0;
        while(!wStack.isEmpty()){
            mWord[index++] = wStack.pop();
        }

        System.out.println(Arrays.toString(mWord));
    }
}
