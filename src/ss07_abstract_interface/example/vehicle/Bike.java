package ss07_abstract_interface.example.vehicle;

public class Bike implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    public void printStates(){
        System.out.println("speed: "+ speed+" gear: "+gear);
    }
}
