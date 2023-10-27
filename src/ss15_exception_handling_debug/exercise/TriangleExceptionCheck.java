package ss15_exception_handling_debug.exercise;

public class TriangleExceptionCheck {
    //Hàm kiểm tra tam giác hợp lệ
    public void checkTriangle(double a, double b, double c) throws TriangleEdgesException{
        if (a + b > c && a + c > b && b + c > a){
            if (a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b){
                System.out.println("Là tam giác vuông.");
            }else if (a==b && b==c){
                System.out.println("Là tam giác điều.");
            }else if (a==b || a==c || b==c){
                System.out.println("Là tam giác cân.");
            }else if (a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b){
                System.out.println("Là tam giác tù.");
            }else {
                System.out.println("Là tam giác nhọn.");
            }
        }else {
            throw new TriangleEdgesException("Lỗi: tam giác không hợp lệ.");
        }
    }
}
