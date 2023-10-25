package extra_exercises.controller;

import extra_exercises.model.Product;
import extra_exercises.service.IProductService;
import extra_exercises.service.impl.ProductService;

import java.util.List;

public class ProductController {
    private final IProductService productService = new ProductService();
    public List<Product> getAll() {
        return productService.getAll();
    }

    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    public Boolean removeProduct(Integer id) {
        return productService.removeProduct(id);
    }

    public boolean checkId(Integer id) {
        return productService.checkId(id);
    }

    public void editProduct(Integer id, Product product) {
        productService.editProduct(id, product);
    }

    public Product searchByName(String name) {
        return productService.searchByName(name);
    }

    public void ascendingProduct() {
        productService.ascendingProduct();
    }

    public void descendingProduct() {
        productService.descendingProduct();
    }
}
