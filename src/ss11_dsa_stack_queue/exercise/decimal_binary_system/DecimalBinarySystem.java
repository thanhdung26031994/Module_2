package ss11_dsa_stack_queue.exercise.decimal_binary_system;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DecimalBinarySystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer>  stack = new Stack<>();
        int number;
        System.out.println("Nhập số chuyển sang nhị phân: ");
        number = input.nextInt();
        //cach 1
        //System.out.println(Integer.toBinaryString(number));

        while (number != 0){
            int number1 = number%2;
            stack.push(number1);
            number /= 2;
        }
        System.out.println("Dãy số nhị phân là: ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
