package ss17_oi_binary_serialization.practive.copy_file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFileSteam {

    private static void copyFileUsingJava7Files(File soure, File dest) throws IOException{
        Files.copy(soure.toPath(), dest.toPath(), StandardCopyOption.COPY_ATTRIBUTES);
    }

    private static void copyFileSteam(File soure, File dest) throws IOException{
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(soure);
            outputStream = new FileOutputStream(dest);
            byte[] bytes = new byte[1024];
            int length;
            while ((length = inputStream.read(bytes)) > 0){
                outputStream.write(bytes, 0, length);
            }
        }finally {
            inputStream.close();
            outputStream.close();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter soure file: ");
        String sourcePath = input.nextLine();
        System.out.println("Enter destination file: ");
        String destPath = input.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingJava7Files(sourceFile, destFile);
            System.out.println("Copy completed.");
        } catch (IOException e) {
            System.out.println("Can't copy that file");
            System.out.println(e.getMessage());
        }
    }


}
