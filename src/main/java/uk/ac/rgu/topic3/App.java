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
    

};



Canfly flyingThing = new Eagle(name:"Kenny");

IsPredator eatingthing = new Eagle(name:"kemal");

acceptFlyingThings(flyingThing);


}

public static void acceptAnimal (Animal animal){
    System.out.println(animal.makeSound());

}

public static void acceptFlyingThings (Canfly thing){
    thing.fly();
}

}
