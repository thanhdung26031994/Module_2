package extra_exercises2.controllers;

import extra_exercises2.models.Product;
import extra_exercises2.services.IProductService;
import extra_exercises2.services.impl.ProductService;

import java.util.List;

public class ProductController {
    private IProductService productService = new ProductService();
    public List<Product> getAll() {
        return productService.getAll();
    }

    public void addProduct(Product product) {
        productService.createProduct(product);
    }

    public Boolean removeProduct(Integer id) {
        return productService.removeProduct(id);
    }
}
