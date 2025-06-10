
package game;

import game.database.LoginManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;

    public void handleLogin(ActionEvent event) {
        LoginManager.login(usernameField.getText(), passwordField.getText());
    }

    public void handleRegister(ActionEvent event) {
        LoginManager.register(usernameField.getText(), passwordField.getText());
    }

    public void handleBack(ActionEvent event) throws Exception {
        new MainMenuController().handleQuit(event); // shortcut to exit or implement back
    }
}
