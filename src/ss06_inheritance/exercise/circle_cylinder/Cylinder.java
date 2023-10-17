package ss06_inheritance.exercise.circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    Cylinder(){
    }
    Cylinder(double height){
        this.height = height;
    }
    Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public double getVolume(){
        return Math.PI* this.getRadius() *this.getRadius()*this.height;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", The tich: "
                + getVolume();
    }
}
