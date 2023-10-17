package ss06_inheritance.practive.super_subclass;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        circle.setFilled("Black");
        System.out.println("A circle " + circle.toString());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
        System.out.println();
        Rectangle rectangle = new Rectangle(2,4);
        System.out.println("A rectangle "+rectangle.toString());
        System.out.println("A area is "+rectangle.getArea());
        System.out.println("A perimeter is "+rectangle.getPerimeter());
        System.out.println();

    }
}
