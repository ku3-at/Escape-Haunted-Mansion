
package game;

import javafx.event.ActionEvent;

public class GameOverController {
    public void handleRestart(ActionEvent event) throws Exception {
        new MainMenuController().switchScene("fxml/MainMenu.fxml", event);
    }

    public void handleQuit(ActionEvent event) {
        System.exit(0);
    }
}
