package ss12_java_collections_framework.exercise.view;

import ss12_java_collections_framework.exercise.controller.ProductController;


import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        ProductController productService = new ProductController();
        Scanner input = new Scanner(System.in);
        int choice = Integer.parseInt(input.nextLine());
        do {
            System.out.println("Vui lòng chọn chức năng: \n"+
                    "1. Thêm sản phẩm. \n" +
                    "2. Sửa thông tin sản phẩm. \n" +
                    "3. Xoá sản phẩm. \n" +
                    "4. Hiển thị danh sách sản phẩm. \n" +
                    "5. Tìm kiếm sản phẩm theo tên. \n" +
                    "6. Sắp xếp sản phẩm tăng dần. \n" +
                    "7. Sắp xếp sản phẩm giảm dần. \n" +
                    "0. Thoát. \n"
                    );


            switch (choice){
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.editProduct();
                    break;
                case 3:
                    productService.deleteProduct();
                    break;
                case 4:
                    productService.displayProduct();
                    break;
                case 5:
                    productService.seachProduct();
                    break;
                case 6:
                    productService.ascendingProduct();
                    break;
                case 7:
                    productService.descendingProduct();
                    break;
                case 0:
                    System.out.println("Hẹn gặp lại.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng nhập đúng số.");
            }
        }while (true);
    }

}
