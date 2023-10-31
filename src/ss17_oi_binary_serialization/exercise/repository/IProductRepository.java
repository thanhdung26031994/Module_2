package ss17_oi_binary_serialization.exercise.repository;

import ss17_oi_binary_serialization.exercise.model.Product;

import java.util.List;

public interface IProductRepository {
    boolean checkId(Integer id);

    void addProduct(Product product);

    List<Product> getAll();

    List<Product> findByName(String name);
}
