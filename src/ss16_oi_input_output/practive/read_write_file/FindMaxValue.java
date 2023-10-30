package ss16_oi_input_output.practive.read_file_example;

import ss16_oi_input_output.practive.read_write_file.ReadAndWriteFile;

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
        List<Integer> numbers = readAndWriteFile.readAndWriteFile()
    }
}
