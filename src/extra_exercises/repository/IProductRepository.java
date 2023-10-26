package extra_exercises.repository;

import extra_exercises.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();
    void addProduct(Product p);
    Product findById(Integer id);

    void deleteById(Integer id);

    boolean checkId(Integer id);

    void editProduct(Integer id, Product o);

    List<Product> seacrchByName(String name);

    void ascendingProduct();

    void descendingProduct();
}
