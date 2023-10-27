package ss15_exception_handling_debug.exercise;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        TriangleExceptionCheck triangleExceptionCheck = new TriangleExceptionCheck();

        Double inputA;
        Double inputB;
        Double inputC;

        try {
            System.out.println("Nhập cạnh a: ");
            inputA = input.nextDouble();
            System.out.println("Nhập cạnh b: ");
            inputB = input.nextDouble();
            System.out.println("Nhập cạnh c: ");
            inputC = input.nextDouble();
            try {
                triangleExceptionCheck.checkTriangle(inputA, inputB, inputC);
            } catch (TriangleEdgesException e) {
                System.err.println(e.getMessage());
            }
        }catch (Exception e){
            System.err.println("Sai: không đúng định dạng.");
        }



    }
}
