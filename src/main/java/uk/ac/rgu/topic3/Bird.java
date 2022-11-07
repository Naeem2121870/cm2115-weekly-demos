package uk.ac.rgu.topic3;

<<<<<<< HEAD
public abstract class Bird extends Animal {

    public Bird (String name) {
        super(name);
    }
    

    public final void  peck (){
        System.out.println(this.name + " is pecking ");
=======
public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Tweet";
>>>>>>> 151e05188c68dc1d02476fff1d25898dc7ad3c8a
    }
}
