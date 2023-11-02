package ss17_oi_binary_serialization.exercise.service;

import ss17_oi_binary_serialization.exercise.model.Product;

import java.util.List;

public interface IProductService {

    List<Product> getAll();

    List<Product> findByName(String name);

    void addProduc(Product product);
}
