package ss11_dsa_stack_queue.exercise.count_number_occurrences;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountTheNumberOfOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi muốn đếm: ");
        String str = input.nextLine();
        Map<Character, Integer> treeMap = new TreeMap<>();
        Character keys;
        int count;
        for (int i=0; i<str.length(); i++){
            keys = str.charAt(i);
            if (treeMap.containsKey(keys)){
                count = treeMap.get(keys);
                treeMap.put(keys, count + 1);
            }else {
                treeMap.put(keys, 1);
            }
        }
        System.out.println(treeMap);
    }
}
