
package escapegame;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Room3 {
    public Room3(Stage stage) {
        Label prompt = new Label("I speak without a mouth and hear without ears. What am I?");
        TextField input = new TextField();
        Label feedback = new Label();
        Button submit = new Button("Submit");

        submit.setOnAction(e -> {
            if (input.getText().trim().equalsIgnoreCase("5")) { // sample answer
                feedback.setText("Correct! Moving to Room 4...");
                new Room4(stage).show();
            } else {
                feedback.setText("Incorrect. Try again!");
            }
        });

        VBox layout = new VBox(10, prompt, input, submit, feedback);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");
        Scene scene = new Scene(layout, 400, 200);
        stage.setTitle("Room 3");
        stage.setScene(scene);
    }

    public void show() {
        // Already shown in constructor
    }
}
