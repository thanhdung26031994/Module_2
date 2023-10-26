package extra_exercises.view;

import extra_exercises.controller.ProductController;
import extra_exercises.model.Product;

import java.util.List;
import java.util.Scanner;

public class Menu {

    private static Scanner input = new Scanner(System.in);
    private static ProductController productController = new ProductController();
    public static void main(String[] args) {

        Integer id;
        Product product;

        int choice;
        do {
            System.out.println("----------Menu---------");
            System.out.println("1.Thêm sản phẩm.");
            System.out.println("2.Sửa thông tin sản phẩm.");
            System.out.println("3.Xoá sản phẩm (ID).");
            System.out.println("4.Hiển thị danh sách sản phẩm.");
            System.out.println("5.Tìm kiếm sản phẩm theo tên");
            System.out.println("6.Sắp xếp sản phẩm tăng dần");
            System.out.println("7.Sắp xếp sản phẩm giảm dần");
            System.out.println("0.Thoát");
            System.out.print("Vui lòng chọn: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    id = inpId();
                    product = inputInformation1();
                    product.setId(id);
                    productController.addProduct(product);
                    System.out.println("Thêm sản phẩm thành công.");
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    id = inpId();
                    Boolean isSuccess = productController.removeProduct(id);
                    if (isSuccess){
                        System.out.println("Xoá thành công.");
                    }else {
                        System.out.println("Id không tìm thấy.");
                    }
                    break;
                case 4:
                    List<Product> products = productController.getAll();
                    if (products.isEmpty()){
                        System.out.println("Không có sản phẩm trong kho.");
                    }else {
                        System.out.println("---------------");
                        System.out.println("Danh sách sản phẩm");
                        for (Product temp: products){
                            System.out.println(temp);
                        }
                    }
                    break;
                case 5:
                    searchProductByName();
                    break;
                case 6:
                    ascendingProduct();
                    break;
                case 7:
                    descendingProduct();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Ban chọn sai. Vui lòng chọn lại.");
            }
        }while (true);
    }

    private static void descendingProduct() {
        System.out.println("-----------Giảm dần-----------");
        productController.descendingProduct();
    }

    private static void ascendingProduct() {
        System.out.println("-----------Tăng dần-----------");
        productController.ascendingProduct();

    }

    private static void searchProductByName() {
        System.out.println("Nhập tên sản phẩm tìm kiếm: ");
        String name = input.nextLine();
        if (productController.searchByName(name) == null){
            System.out.println("Sản phẩm này không có.");
        }else {
            System.out.println(productController.searchByName(name));
        }
    }

    private static void editProduct() {
        Integer id = inpId();
        String name;
        Double price;
        if (productController.checkId(id)){
            System.out.print("Nhập thay đổi tên sản phẩm: ");
            name = input.nextLine();
            System.out.print("Nhập thay đổi giá: ");
            price = Double.valueOf(input.nextLine());
            productController.editProduct(id, new Product(name, price));
        }else {
            System.out.println("Không có id muốn thay đổi.");
        }
    }

    private static Product inputInformation1() {
        System.out.print("Nhập tên sản phẩm: ");

        String name = input.nextLine();
        System.out.print("Nhập giá sản phâm: ");
        Double price = Double.valueOf(input.nextLine());
        return new Product(name, price);
    }

    private static Integer inpId() {
        System.out.println("Nhập id sản phẩm: ");
        return Integer.valueOf(input.nextLine());
    }
}
