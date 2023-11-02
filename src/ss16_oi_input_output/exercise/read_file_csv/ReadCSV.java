package ss16_oi_input_output.exercise.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCSV {
    //    public void readCSV(String path){
//        List<String> stringList = new ArrayList<>();
//        File file = null;
//        BufferedReader bufferedReader = null;
//        try {
//            file = new File(path);
//            if (!file.exists()){
//                throw new FileNotFoundException();
//            }
//            bufferedReader = new BufferedReader(new FileReader(file));
//            String line = "";
//            while ((line = bufferedReader.readLine()) != null){
//                System.out.println(line);
//                stringList.add(line);
//            }
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
    private void readFileCSV(String path) {
        List<String> stringList = new ArrayList<>();
        File file = null;
        BufferedReader bufferedReader = null;
        try {
            file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            bufferedReader = new BufferedReader(new FileReader(path));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                stringList.add(line);
            }
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi!");
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file: ");

        String path = scanner.nextLine();

        ReadCSV readCSV = new ReadCSV();
        readCSV.readFileCSV(path);
    }
}
