package ss17_oi_binary_serialization.exercise.controller;

import ss17_oi_binary_serialization.exercise.model.Product;
import ss17_oi_binary_serialization.exercise.service.IProductService;
import ss17_oi_binary_serialization.exercise.service.impl.ProductService;

import java.util.List;

public class ProductController {
    private static IProductService iProductService = new ProductService();

    public boolean checkId(Integer id) {
        return iProductService.checkId(id);
    }

    public void addProduct(Product product) {
        iProductService.addProduct(product);
    }

    public List<Product> getAll() {
        return iProductService.getAll();
    }

    public List<Product> findByName(String name) {
        return iProductService.findByName(name);
    }
}
