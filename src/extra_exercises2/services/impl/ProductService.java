package extra_exercises2.services.impl;

import extra_exercises2.models.Product;
import extra_exercises2.repositories.IProductRepository;
import extra_exercises2.repositories.impl.ProductRepository;
import extra_exercises2.services.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public void createProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Boolean removeProduct(Integer id) {
        Product product = productRepository.findById(id);
        if(product == null) {
            return false;
        } else {
            productRepository.deleteById(id);
            return true;
        }

    }
}
