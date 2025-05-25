
package escapegame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Room1 room1 = new Room1(primaryStage);
        room1.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
