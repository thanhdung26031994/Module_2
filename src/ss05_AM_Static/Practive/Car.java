package ss05_AM_Static.Practive;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public String getEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
    }
}
