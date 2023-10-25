package ss12_java_collections_framework.exercise.repository;

import ss12_java_collections_framework.exercise.model.Product;

import java.util.*;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1,"Bia", 25000));
        productList.add(new Product(2,"Coca", 15000));
        productList.add(new Product(3,"Bánh", 20000));
    }
    @Override
    public void addProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ID sản phẩm: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = input.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(input.nextLine());
        Product product = new Product(id, name, price);
        productList.add(product);
    }

    @Override
    public void editProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ID để sửa sản phẩm: ");
        int editId = Integer.parseInt(input.nextLine());
        int length = productList.size();
        for (int i = 0; i < length ; i++) {
            if (productList.get(i).getId() == editId){
                System.out.println("Nhập sửa đổi tên sản phẩm: ");
                String name = input.nextLine();
                System.out.println("Nhập sửa đổi giá: ");
                int price = Integer.parseInt(input.nextLine());
                productList.get(i).setName(name);
                productList.get(i).setPrice(price);
                System.out.println("Đã sửa đổi thành công.");
            }
        }
    }

    @Override
    public void deleteProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ID để xoá sản phẩm: ");
        int deleteId = Integer.parseInt(input.nextLine());
        for (int i = 0; i < productList.size(); i++){
            if (productList.get(i).getId() == deleteId){
                productList.remove(i);
                System.out.println("Đã xoá sản phẩm thành công.");
            }
        }
    }

    @Override
    public void displayProduct() {
        for (Product product: productList){
            System.out.println(product);
        }
    }

    @Override
    public void seachProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        String nameId = input.nextLine();
        for (int i = 0; i < productList.size(); i++){
            if (productList.get(i).getName().equals(nameId)){
                System.out.println(productList.get(i));
            }
        }
    }
    // tăng dần
    @Override
    public void ascendingProduct() {
//        productList.sort(Product::compareTo);
//        for (Product product: productList){
//            System.out.println(product);
//        }
    }
    //giảm dần
    public void descendingProduct(){
        DecreaseProduct decreaseProduct = new DecreaseProduct();
        Collections.sort(productList, decreaseProduct);
        for (Product product: productList){
            System.out.println(product);
        }
    }
}
