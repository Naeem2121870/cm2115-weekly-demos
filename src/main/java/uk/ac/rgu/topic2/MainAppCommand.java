package uk.ac.rgu.topic2;

public class MainAppCommand implements Command {
    
    private App instance;
    public MainAppCommand(MainAppCommand instance){
        this.instance = instance;
    }

    @Override
    public void execute() {
        instance.doSomething();
    }
}
