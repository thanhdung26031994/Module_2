package ss17_oi_binary_serialization.exercise.utils;

import ss17_oi_binary_serialization.exercise.model.Product;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteFile {
    private static final String PATH = "src/ss17_oi_binary_serialization/exercise/data/Product.txt";

    public static void writeToFile(List<Product> products){
        FileOutputStream fileOutputStream =null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(PATH);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            System.out.println("Ghi file thành công");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
