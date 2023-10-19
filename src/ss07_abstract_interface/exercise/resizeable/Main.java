package ss07_abstract_interface.exercise.resizeable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random()*10);
        Shape[] shapes = new Shape[]{
                new Circle(x, "yellow", false),
                new Rectangle(x, x, "red", true),
                new Square(x, "blue", true)
        };
        System.out.println("Trước khi resize");
        for (Shape shape: shapes){
            System.out.println(shape + "\n");
        }

        System.out.println("Sau khi resize");
        for (Shape shape: shapes){
            if (shape instanceof Circle){
                Circle circle = (Circle) shape;
                circle.resize(Math.random()*100);
                System.out.println(circle);
            }else if (shape instanceof Rectangle){
                Rectangle rectangle = (Rectangle) shape;
                rectangle.resize(Math.random()*100);
                System.out.println(rectangle);
            }else if (shape instanceof Square){
                Square square = (Square) shape;
                square.resize(Math.random()*100);
                System.out.println(square);
            }
        }
    }
}
