/**
 * Created by jusbat on 14/05/2017.
 */
package huedesktopapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HueApp extends Application
{

    private static final Logger logger = LogManager.getLogger(HueApp.class);

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("layout.fxml"));
            primaryStage.setTitle("Hue Desktop App");
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
        }
        catch (Exception ex)
        {
            logger.error(ex.getMessage());
        }
    }
}
