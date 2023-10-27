package ss15_exception_handling_debug.practive;

public class TestMain {
    public static void main(String[] args) {
        try {
            throw new Exception("Đây là một ngoại lệ được tạo ra!");
        } catch (Exception e) {
            System.out.println("Ngoại lệ đã được bắt: " + e.getMessage());
        }
    }
}
