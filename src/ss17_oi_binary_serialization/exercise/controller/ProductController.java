package ss17_oi_binary_serialization.exercise.controller;

import ss17_oi_binary_serialization.exercise.model.Product;
import ss17_oi_binary_serialization.exercise.service.IProductService;
import ss17_oi_binary_serialization.exercise.service.impl.ProductService;

import java.util.List;

public class ProductController {
    private static IProductService iProductService = new ProductService();


    public List<Product> getAll() {
        return iProductService.getAll();
    }

    public List<Product> findByName(String name) {
        return iProductService.findByName(name);
    }

    public void addProduc(Product product) {
        iProductService.addProduc(product);
    }
}
