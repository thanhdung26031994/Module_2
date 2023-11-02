package ss16_oi_input_output.exercise.copy_file_test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập link file gốc: ");
        String path = scanner.nextLine();
        CopyFileTest copyFileTest = new CopyFileTest();
        List<String> stringList = copyFileTest.readFile(path);
        System.out.println("Nhập link file đè: ");
        String outPath = scanner.nextLine();
        copyFileTest.writeFile(outPath,stringList);
    }

    public List<String> readFile(String path) {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            System.out.println("File không tồn tại or nội dung có lỗi.");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    public List<String> writeFile(String path, List<String> stringList){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(String.valueOf(stringList));
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringList;
    }
}
