
package escapegame;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Room1 {
    private final String correctCode = "735";

    public Room1(Stage stage) {
        Label prompt = new Label("Enter the 3-digit combination to unlock the door:");
        TextField input = new TextField();
        Label feedback = new Label();
        Button submit = new Button("Submit");

        submit.setOnAction(e -> {
            if (input.getText().equals(correctCode)) {
                feedback.setText("Correct! Moving to Room 2...");
                new Room2(stage).show();
            } else {
                feedback.setText("Wrong combination. Try again!");
            }
        });

        VBox layout = new VBox(10, prompt, input, submit, feedback);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");
        Scene scene = new Scene(layout, 400, 200);
        stage.setTitle("Room 1 - Combination Lock");
        stage.setScene(scene);
    }

    public void show() {
        // Already shown in constructor
    }
}
