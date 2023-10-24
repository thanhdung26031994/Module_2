package ss12_java_collections_framework.exercise.repository;



import ss12_java_collections_framework.exercise.model.Product;

import java.util.Comparator;

public class DecreaseProduct implements Comparator<Product> {
    public int compare(Product product1, Product product2){
        if (product1.getPrice() == product2.getPrice()){
            return 0;
        }else if (product1.getPrice() >= product2.getPrice()){
            return -1;
        }else {
            return 1;
        }
    }
}
