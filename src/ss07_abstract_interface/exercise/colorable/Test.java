package ss07_abstract_interface.exercise.colorable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle(5),
                new Rectangle(3,4),
                new Square(8)
        };

        System.out.println("Display Colorable: ");
        for (Shape x:shapes){
            if (x instanceof Circle){
                Circle circle = (Circle) x;
                System.out.println("Circle: " + circle.getArea());
            }else if (x instanceof Rectangle){
                Rectangle rectangle = (Rectangle) x;
                System.out.println("Rectangle: " + rectangle.getArea());
            }else if (x instanceof Square){
                Square square = (Square) x;
                System.out.println("Square: " );
                square.howToColor();
            }
        }
    }
}
