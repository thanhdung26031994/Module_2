package ss17_oi_binary_serialization.exercise.service.impl;

import ss17_oi_binary_serialization.exercise.model.Product;
import ss17_oi_binary_serialization.exercise.repository.IProductRepository;
import ss17_oi_binary_serialization.exercise.repository.impl.ProductRepository;
import ss17_oi_binary_serialization.exercise.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private static IProductRepository iProductRepository = new ProductRepository();


    @Override
    public List<Product> getAll() {
        return iProductRepository.getAll();
    }

    @Override
    public List<Product> findByName(String name) {
        return iProductRepository.findByName(name);
    }

    @Override
    public void addProduc(Product product) {
        iProductRepository.addProduc(product);
    }
}
