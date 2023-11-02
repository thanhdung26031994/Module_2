package ss17_oi_binary_serialization.exercise.repository.impl;

import ss17_oi_binary_serialization.exercise.model.Product;
import ss17_oi_binary_serialization.exercise.repository.IProductRepository;
import ss17_oi_binary_serialization.exercise.utils.ReadFile;
import ss17_oi_binary_serialization.exercise.utils.WriteFile;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    @Override
    public List<Product> getAll() {
        return ReadFile.readToFile();
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = ReadFile.readToFile();
        List<Product> products = new ArrayList<>();
        for (Product p: productList){
            if (p.getName().toLowerCase().contains(name.toLowerCase())){
                products.add(p);
            }
        }
        return products;
    }

    @Override
    public void addProduc(Product product) {

//        for (Product p: product)
    }
}
