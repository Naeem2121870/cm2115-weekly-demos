package uk.ac.rgu.topic2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * This example demonstrates a simple JavaFX project, with an FXML scene and associated Controller class
 * 
 * Suggested exercises to deepen your understanding:
 * 
 * 1) Add some more components to the created scene (you'll find it under src/main/resouces/uk/ac/rgu/topic2). Explore
 *      the different components available and think about what they could be used for.
 * 
 * 2) Explore the different properties of different components in the Properties panel of the Scene Builder. For example,
 *      changing the text on a Button or in a Label, or using the Style section to add CSS styling.
 * 
 * 3) Create a new scene and use the setRoot() method below to switch to it from MyScene (using the Controller class). Note: 
 *      we will use a slightly different method of switching scenes in the Smart Home project, and the coursework.
 */
public class App extends Application {

    private static Scene scene;
    private Logger logger;

        public void setLogger (Logger logger){
            this.logger = logger;

public Class MainApp{



        private static Command [] commands = new Command[10];
        private String[] words = {"computing","aberdeen", "amphibin","mouse"};

        public void doSomething(){
            if(this.logger != null){
                logger.log(msg:"I'm doing something !");
            }
        }
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("MyScene"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
       // launch();
      App instance = new App();
      ForwardPrintStrategy = new ForwardPrintStrategy();
      instance.printWords(s);
      System.out.println(x:"");


    }

        PrintStrategy s2 = (values) ->{
            for(int i=values.length -1; i>=0; i--){
                System.out.println(values[i]);

            }

        };

        instance.printWords(s2);
    }


}