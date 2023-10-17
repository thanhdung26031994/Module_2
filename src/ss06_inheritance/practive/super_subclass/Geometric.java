package ss06_inheritance.practive.super_subclass;

public class Geometric {
    private String color = "while";
    private String filled = null;

    public Geometric(){}

    public Geometric(String color, String filled){
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public String getFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "created with \"" + color + "\" color and " +
                (filled == null ? "no fill" : "filled with \"" + filled + "\" color");
    }
}
