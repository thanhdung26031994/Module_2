package extra_exercises.service;

import extra_exercises.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();

    void addProduct(Product product);

    Boolean removeProduct(Integer id);

    boolean checkId(Integer id);

    void editProduct(Integer id, Product product);

    Product searchByName(String name);

    void ascendingProduct();

    void descendingProduct();
}
