package ss04_OOP.Exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(double a, double b, double c){
        return b*b - 4*a*c;
    }
    public double getRoot1(double a, double b, double c){
        return (-b + Math.sqrt(this.getDiscriminant(a,b,c)))/(2*a);
    }
    public double getRoot2(double a, double b, double c){
        return (-b - Math.sqrt(this.getDiscriminant(a,b,c)))/(2*a);
    }

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.println("Input a: ");
        a = input.nextDouble();
        System.out.println("Input b: ");
        b = input.nextDouble();
        System.out.println("Input c: ");
        c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        double delta = quadraticEquation.getDiscriminant(a, b, c);
        if (delta > 0){
            System.out.println("Root 1: " + quadraticEquation.getRoot1(a,b,c));
            System.out.println("Root 2: " + quadraticEquation.getRoot2(a,b,c));
        }else if(delta == 0){
            System.out.println("Root: " + quadraticEquation.getRoot1(a,b,c));
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
