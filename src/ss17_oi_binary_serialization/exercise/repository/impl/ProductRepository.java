package ss17_oi_binary_serialization.exercise.repository.impl;

import ss17_oi_binary_serialization.exercise.model.Product;
import ss17_oi_binary_serialization.exercise.repository.IProductRepository;
import ss17_oi_binary_serialization.exercise.utils.ReadFile;
import ss17_oi_binary_serialization.exercise.utils.WriteFile;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();


    @Override
    public boolean checkId(Integer id) {
        for (Product p: productList){
            if (p.getId(id).equals(id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
        WriteFile.writeToFile(productList);
    }

    @Override
    public List<Product> getAll() {
        return ReadFile.readToFile();
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> products = new ArrayList<>();
        for (Product p: productList){
            if (p.getName().toLowerCase().contains(name.toLowerCase())){
                products.add(p);
            }
        }
        return products;
    }
}
