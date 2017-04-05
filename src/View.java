import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
/**
 * Created by User on 10.03.2017.
 */
public class View extends Application {


    public static ZooMenager zooMenager;
    public static void setZooMenager(ZooMenager zoo) {

        zooMenager = zoo;
    }
    public void show() {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = createSceneGraph();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private Parent createSceneGraph() throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("AnimalControl.fxml"));

        return parent;

    }
}





