package ss12_java_collections_framework.exercise.controller;

import ss12_java_collections_framework.exercise.service.IProductService;
import ss12_java_collections_framework.exercise.service.ProductService;

public class ProductController{

    private IProductService productService = new IProductService();
    public void addProduct() {
        productService.addProduct();
    }
    public void editProduct(){
        productService.editProduct();
    }
    public void deleteProduct(){
        productService.deleteProduct();
    }
    public void displayProduct(){
        productService.displayProduct();
    }
    public void seachProduct(){
        productService.seachProduct();
    }
    public void ascendingProduct(){
        productService.ascendingProduct();
    }
    public void descendingProduct(){
        productService.descendingProduct();
    }
}
