package ss06_inheritance.exercise.circle_cylinder;

public class Circle {
    private double radius;
    private String color;
    public Circle(){

    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return 2*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Ban kinh: "
                + this.radius
                + ", Dien tich: "
                + getArea()
                + ", Mau: "
                + this.color;
    }
}
