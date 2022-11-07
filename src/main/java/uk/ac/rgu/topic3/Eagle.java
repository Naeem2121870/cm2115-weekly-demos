package uk.ac.rgu.topic3;

public class Eagle extends Bird implements Canfly, IsPredator{

    public Eagle(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eat() {
        System.out.println(x:" I'm flyging.");
        
    }

    @Override
    public void fly() {
        System.out.println(x:" I'm flyging.");
        
    }

    
    
}
