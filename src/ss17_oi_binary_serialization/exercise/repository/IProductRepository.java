package ss17_oi_binary_serialization.exercise.repository;

import ss17_oi_binary_serialization.exercise.model.Product;

import java.util.List;

public interface IProductRepository {

    List<Product> getAll();

    List<Product> findByName(String name);

    void addProduc(Product product);
}
