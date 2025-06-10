
package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PuzzleRoomController {
    @FXML private TextField answerField;

    public void handleSubmit(ActionEvent event) throws Exception {
        String answer = answerField.getText().trim().toLowerCase();
        if (answer.equals("ghost")) {
            new MainMenuController().switchScene("fxml/GameOver.fxml", event);
        } else {
            System.out.println("Incorrect answer.");
        }
    }

    public void handleBack(ActionEvent event) throws Exception {
        new MainMenuController().switchScene("fxml/MainMenu.fxml", event);
    }
}
