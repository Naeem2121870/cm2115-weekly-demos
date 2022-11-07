package uk.ac.rgu.topic3;

public interface Canfly {
    
    public void fly ();
   
   
    default int getFlyingDistance (){
        return -1;

    }
    }
