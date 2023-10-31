package ss17_oi_binary_serialization.exercise.service;

import ss17_oi_binary_serialization.exercise.model.Product;

import java.util.List;

public interface IProductService {
    boolean checkId(Integer id);

    void addProduct(Product product);

    List<Product> getAll();

    List<Product> findByName(String name);
}
