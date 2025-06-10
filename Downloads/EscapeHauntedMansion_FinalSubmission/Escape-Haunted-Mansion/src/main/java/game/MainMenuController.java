
package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenuController {
    public void handleStartGame(ActionEvent event) throws Exception {
        switchScene("fxml/PuzzleRoom.fxml", event);
    }

    public void handleLogin(ActionEvent event) throws Exception {
        switchScene("fxml/Login.fxml", event);
    }

    public void handleQuit(ActionEvent event) {
        System.exit(0);
    }

    private void switchScene(String fxmlPath, ActionEvent event) throws Exception {
        Stage stage = (Stage)((javafx.scene.Node)event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource(fxmlPath));
        stage.setScene(new Scene(root));
        stage.show();
    }
}
