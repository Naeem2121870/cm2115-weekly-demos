package uk.ac.rgu.topic3;


public abstract class Animal {
    
    
    protected String name;

    
    public Animal(String name){
        this.name = name; 
    }

<<<<<<< HEAD

=======
    /**
     * An abstract method doesn't have an implementation, only a method signature.
     * These are only allowed in abstract classes, and are used as a way of guaranteeing that
     * sub-classes provide an implementation. 
     * Here, we know that all animals make a sound - but we need each class to tell us what that sound is
     * @return
     */
>>>>>>> 151e05188c68dc1d02476fff1d25898dc7ad3c8a
    public abstract String makeSound();



}
