package ss12_java_collections_framework.exercise.service;


import ss12_java_collections_framework.exercise.repository.IProductManager;

public class IProductService implements ProductService {
    private IProductManager iProductManager = new IProductManager();
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

}
