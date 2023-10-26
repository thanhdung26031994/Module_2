package extra_exercises.service.impl;

import extra_exercises.model.Product;
import extra_exercises.repository.IProductRepository;
import extra_exercises.repository.impl.ProductRepository;
import extra_exercises.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();
    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public void addProduct(Product p) {
        productRepository.addProduct(p);
    }

    @Override
    public Boolean removeProduct(Integer id) {
        Product product = productRepository.findById(id);
        if (product == null){
            return false;
        }else {
            productRepository.deleteById(id);
            return true;
        }
    }

    @Override
    public boolean checkId(Integer id) {
        return productRepository.checkId(id);
    }

    @Override
    public void editProduct(Integer id, Product o) {
        productRepository.editProduct(id, o);
    }

    @Override
    public List<Product> searchByName(String name) {
        return productRepository.seacrchByName(name);
    }

    @Override
    public void ascendingProduct() {
        productRepository.ascendingProduct();
    }

    @Override
    public void descendingProduct() {
        productRepository.descendingProduct();
    }
}
