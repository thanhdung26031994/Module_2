package ss16_oi_input_output.practive.read_write_file;

import java.util.List;

public class FindMaxValue {
    public static int findMaxValue(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)){
                max = numbers.get(i);

            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\numbers.txt");
        int value = findMaxValue(numbers);
        readAndWriteFile.writeFile("D:\result.txt", value);
    }
}
