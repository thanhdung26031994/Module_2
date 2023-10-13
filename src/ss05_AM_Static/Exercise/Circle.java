package ss05_AM_Static.Exercise;

public class Circle {
    private double radius;
    private String color = "red";
    public Circle(){
    }
    public Circle(double r){
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
