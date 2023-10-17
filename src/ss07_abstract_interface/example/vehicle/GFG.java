package ss07_abstract_interface.example.vehicle;

public class GFG {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        System.out.println("Bicycle present state:");
        bicycle.printStates();
    }
}
