package ss12_java_collections_framework.exercise.service;


import ss12_java_collections_framework.exercise.repository.ProductRepository;

public class ProductService implements IProductService {
    private ProductRepository iProductManager = new ProductRepository();
    @Override
    public void addProduct() {
        iProductManager.addProduct();
    }

    @Override
    public void editProduct() {
        iProductManager.editProduct();
    }

    @Override
    public void deleteProduct() {
        iProductManager.deleteProduct();
    }
    public void displayProduct(){
        iProductManager.displayProduct();
    }
    public void seachProduct(){
        iProductManager.seachProduct();
    }
    public void ascendingProduct(){
        iProductManager.ascendingProduct();
    }
    public void descendingProduct(){
        iProductManager.descendingProduct();
    }
}
