package uk.ac.rgu.topic3;

public class Pegasus extends Horse implements Canfly {

    public Pegasus(String name) {
        super(name);
        
    }

    @Override
    public void fly() {
    
        System.out.println(x:"PEGASUS IS FLYING");
        
    }

    

}
