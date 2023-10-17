package ss07_abstract_interface.practive;

import ss07_abstract_interface.practive.animal.Animal;
import ss07_abstract_interface.practive.animal.Chicken;
import ss07_abstract_interface.practive.animal.Tiger;
import ss07_abstract_interface.practive.edible.Edible;
import ss07_abstract_interface.practive.fruit.Apple;
import ss07_abstract_interface.practive.fruit.Fruit;
import ss07_abstract_interface.practive.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal:animals){
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for (Fruit fruit1: fruit){
            System.out.println(fruit1.howToEat());
        }
    }
}
