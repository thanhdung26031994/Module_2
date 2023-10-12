package ss04_OOP.Exercise.Fan;

import java.util.Scanner;

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
    /*public boolean getTurnOff(){
        on = false;
    }*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.getFAST();
        fan1.getSpeed();
        fan1.getTurnOn();
        System.out.println(fan1);
    }
}
