package uk.ac.rgu.topic2;

public class ForwardPrintStrategy implements PrintStrategy {


    @Override
    public void print(String[] values){
        for (String value : values){
            System.out.println(value);
            
        }

    }
    
    
}
