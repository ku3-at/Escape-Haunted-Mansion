
#!/bin/bash
echo "Running Escape the Haunted Mansion..."
JAVAFX_LIB=lib/javafx/lib
PATH_TO_FX="--module-path $JAVAFX_LIB --add-modules javafx.controls,javafx.fxml"
mkdir -p out
javac $PATH_TO_FX -d out src/main/java/game/*.java src/main/java/game/database/*.java
java $PATH_TO_FX -cp out game.MainMenuController
