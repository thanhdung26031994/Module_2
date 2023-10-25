package extra_exercises2.repositories;

import extra_exercises2.models.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void save(Product product);

    Product findById(Integer id);

    void deleteById(Integer id);
}
