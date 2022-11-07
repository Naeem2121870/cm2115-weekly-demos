package uk.ac.rgu.topic3;

import javafx.application.Application ;
import javafx.fxml.FXMLLoader;
import uk.ac.rgu.Plane;;

public class App {
    public static void main (String[] args) {

Canfly[] flyThings = new Canfly[3] {

    flyThings [0] = new Eagle(name: "Eagle");
    flyThings [1] = new Pegasus(name: "Peggy");
    flyThings [2] = new Plane();


    for(int i=0; i<flyThings.length; i++){
        System.out.println(flyThings[i].getFlyingDistance());
    }
    

<<<<<<< HEAD
};



Canfly flyingThing = new Eagle(name:"Kenny");

IsPredator eatingthing = new Eagle(name:"kemal");

acceptFlyingThings(flyingThing);
=======
        

        // Cat cat = new Cat("Felix");
        // Dog dog = new Dog("Fido");

        // /**
        //  * Polymorphism allows us to use a sub-class in place of a super class (i.e., the class that is extended)
        //  * So in this case, because the Cat and Dog classes both extend Animal, we can provide a Cat or Dog object
        //  * whenever an Animal is expected
        //  */
        // acceptAnimal(cat);
        // acceptAnimal(dog);

        // /**
        //  * Polymorphism also allows us to assign variables declared as a super class (so in this case Animal) to
        //  * objects of a sub-type (so in this case, Cat or Dog). We can re-assign the variable to any of the sub-types.
        //  */
        // Animal animal = new Cat("Garfield");
        // animal = new Dog("Odie");

        // /**
        //  * The main use of polymorphism in this way is to be able to store multiple related objects
        //  * in a single array
        //  */
        //  Animal[] animals = new Animal[2];
        //  animals[0] = new Cat("Crookshanks");
        //  animals[1] = new Dog("Gnasher");

        //  /* However, as also explained in the acceptAnimal() method below, we lose the ability to call
        //   * methods only defined in the sub-class, i.e.
        //         animals[0].useLitterTray()
        //     is not allowed, because we only know we have an animal; we don't know that it's a Cat
        //     We can only call methods declared in the Animal class
        //   */

        //   System.out.println(animals[0].makeSound());
        //   System.out.println(animals[1].makeSound());
>>>>>>> 151e05188c68dc1d02476fff1d25898dc7ad3c8a


}

public static void acceptAnimal (Animal animal){
    System.out.println(animal.makeSound());

}

public static void acceptFlyingThings (Canfly thing){
    thing.fly();
}

}
