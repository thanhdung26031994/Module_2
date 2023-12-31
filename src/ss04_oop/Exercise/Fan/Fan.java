package ss04_oop.Exercise.Fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    boolean on = false;
    private double radius = 5;
    String color = "blue";

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public int getFAST() {
        return FAST;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getSLOW() {
        return SLOW;
    }
    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }
    public boolean getTurnOn(){
        return on = true;
    }
    public String getColor(String color){
        this.color = color;
        return this.color;
    }
    public final int getMaxSpeed(){
        this.speed = FAST;
        return this.speed;
    }
    public double getRadius(double radius){
        this.radius = radius;
        return this.radius;
    }
    public final int getMediumSpeed(){
        this.speed = MEDIUM;
        return this.speed;
    }
    public boolean getTurnOff(){
        return on = false;
    }
    @Override
    public String toString() {
        if (this.isOn()) {
            return String.format("Speed: %d, Color: %s, Radius: %.1f. Fan is On", speed, color, radius);
        } else {
            return String.format("Color: %s, Radius: %.1f. Fan is Off", color, radius);
        }
    }

    public static void main(String[] args) {

        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.getColor("Yellow");
        fan1.getMaxSpeed();
        fan1.getRadius(10);
        fan1.getTurnOn();

        fan2.getColor("Green");
        fan2.getMediumSpeed();
        fan2.getTurnOff();

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
