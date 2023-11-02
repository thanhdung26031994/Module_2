package ss17_oi_binary_serialization.exercise.view;

import ss17_oi_binary_serialization.exercise.controller.ProductController;
import ss17_oi_binary_serialization.exercise.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductMenu {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ProductController productController = new ProductController();
    private static Product product;
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("------------Menu---------");
            System.out.println("1.Thêm sản phẩm.");
            System.out.println("2.Hiển thị sản phẩm.");
            System.out.println("3.Tìm sản phẩm.");
            System.out.println("0.Thoát.");
            System.out.print("Vui lòng chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayProduct();
                    break;
                case 3:
                    searchByName();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn lại.");
            }
        }while (true);
    }

    private static void searchByName() {
        System.out.println("Nhập tên sp tìm kiếm: ");
        String name = scanner.nextLine();
        if (productController.findByName(name) == null){
            System.out.println("Sản phầm này không có.");
        }else{
            System.out.println(productController.findByName(name));
        }
    }

    private static void displayProduct() {
        List<Product> products = productController.getAll();
        for (Product p: products){
            System.out.println(p);
        }
    }

    private static void addProduct() {
        System.out.print("Nhập id sản phẩm: ");
        Integer id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập hãng sản phẩm: ");
        String manufactured = scanner.nextLine();
        System.out.println("Mô tả sản phẩm: ");
        String describe = scanner.nextLine();
        productController.addProduc(new Product(id,name, price, manufactured, describe));
        System.out.println("Thêm sản phẩm thành công.");
    }

}
