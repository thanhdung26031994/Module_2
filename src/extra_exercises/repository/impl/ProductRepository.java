package extra_exercises.repository.impl;

import extra_exercises.model.Product;
import extra_exercises.repository.IProductRepository;
import extra_exercises.utils.comparator.DecreaseProduct;

import java.util.*;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1,"Bánh Ít", 25.000));
        products.add(new Product(2,"Bia Dung Quất", 10.000));
        products.add(new Product(3,"Nước Thạch Bích", 10.000));
        products.add(new Product(4,"Sữa Vinasol", 10.000));
    }
    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(Integer id) {
        for (Product product: products){
            if (product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }

    @Override
    public void deleteById(Integer id) {
        for (Product product: products){
            if (product.getId().equals(id)){
                products.remove(product);
                break;
            }
        }
    }

    @Override
    public boolean checkId(Integer id) {
        for (Product product: products){
            if (product.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void editProduct(Integer id, Product product) {
        for (Product p: products){
            if (p.getId().equals(id)){
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                break;
            }
        }
    }

    @Override
    public Product seacrchByName(String name) {
        for (Product product: products){
            if (product.getName().contains(name)){
                return product;
            }
        }
        return null;
    }

    @Override
    public void ascendingProduct() {
        products.sort(Product::compareTo);
        for (Product p:products){
            System.out.println(p);
        }
    }

    @Override
    public void descendingProduct() {
        DecreaseProduct decreaseProduct = new DecreaseProduct();
        Collections.sort(products, decreaseProduct);
        for (Product p: products){
            System.out.println(p);
        }
    }


}
