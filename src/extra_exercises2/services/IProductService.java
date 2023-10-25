package extra_exercises2.services;

import extra_exercises2.models.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();

    void createProduct(Product product);

    Boolean removeProduct(Integer id);
}
