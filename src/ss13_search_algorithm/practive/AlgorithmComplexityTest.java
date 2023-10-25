package ss13_search_algorithm.practive;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputStr = input.nextLine();
        int[] frequentChar = new int[255];
        int ascii;
        for (int i = 0; i < inputStr.length(); i++){
            // tim vi tri tuong ung cua ky tu trong ascii
            ascii = inputStr.charAt(i);
            //tang gia tri tan suat
            frequentChar[ascii] += 1;
        }
        int max= 0;
        Character character = (char) 255;
        for (int i = 0; i < 255; i++){
            if (frequentChar[i] > max){
                max = frequentChar[i];
                character = (char) i;
            }
        }
        System.out.println("The most appearing letter is " + character + " with a frequency of " + max + " times");

    }
}
