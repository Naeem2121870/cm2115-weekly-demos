package uk.ac.rgu.topic2;

public class VerboseLogger implements Logger {

    private  static VerboseLogger instance = null;
    private int numTimeUsed = 0;
    
    public static VerboseLogger getInstance(){

        if(instance == null){
            instance = new VerboseLogger();


        }
        return instance;


}

    private VerboseLogger(){

    }
    

@Override
public void log (String msg){
    this.numTimeUsed++;
    System.out.println("Verbose")

    }

}

