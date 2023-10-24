package ss11_dsa_stack_queue.exercise.palindrome;


import java.util.Scanner;
import java.util.Stack;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String inputStr;
        System.out.println("Nhập vào chuỗi muốn kiểm tra: ");
        inputStr = input.nextLine();
        int length = inputStr.length();
        for (int i = 0; i < length; i++) {
            stack.push(inputStr.charAt(i));
        }
        String reverStr = "";
        while (!stack.isEmpty()) {
            reverStr = reverStr + stack.pop();
        }
        if(inputStr.equals(reverStr)){
            System.out.println("Đây là chuỗi palindrom");
        }else {
            System.out.println("Đây không là chuỗi palindrom");
        }
    }
}
