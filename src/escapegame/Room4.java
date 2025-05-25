
package escapegame;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Room4 {
    public Room4(Stage stage) {
        Label prompt = new Label("What is the result of 15 / 3 + 2?");
        TextField input = new TextField();
        Label feedback = new Label();
        Button submit = new Button("Submit");

        submit.setOnAction(e -> {
            if (input.getText().trim().equalsIgnoreCase("5")) { // sample answer
                feedback.setText("Correct! Moving to Room 5...");
                new Room5(stage).show();
            } else {
                feedback.setText("Incorrect. Try again!");
            }
        });

        VBox layout = new VBox(10, prompt, input, submit, feedback);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");
        Scene scene = new Scene(layout, 400, 200);
        stage.setTitle("Room 4");
        stage.setScene(scene);
    }

    public void show() {
        // Already shown in constructor
    }
}
