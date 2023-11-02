package ss17_oi_binary_serialization.exercise.utils;

import ss17_oi_binary_serialization.exercise.model.Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ReadFile {
    private static final String PATH = "src/ss17_oi_binary_serialization/exercise/data/Product.txt";

    public static List<Product> readToFile(){
        List<Product> products = null;
        ObjectInputStream objectInputStream = null;
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream(PATH);
            objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                objectInputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return products;
    }
}
