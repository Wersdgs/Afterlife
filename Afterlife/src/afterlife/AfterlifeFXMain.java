package afterlife;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import javafx.scene.Group; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;  

/**
 *
 * @author boyza
 */
public class AfterlifeFXMain extends Application {
    
    @Override
    public void start(Stage stage) {
        Image image = new Image("kino.png");
        
        ImageView imageView = new ImageView(image);
        Group root = new Group(imageView);
        Scene scene = new Scene(root, 600, 500);
        
        imageView.setImage(image);
        stage.setScene(scene);
        stage.show();
    
        imageView.setX(50);
        imageView.setY(25);
        
        imageView.setFitHeight(455);
        imageView.setFitWidth(500);
        
        imageView.setPreserveRatio(true);
        
        stage.setTitle("Loading an image");
    /**
     * @param args the command line arguments
     */
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
