
# Escape the Haunted Mansion 🏚️👻

You awaken in a dusty room with no memory of how you arrived. The air is thick with mystery, and shadows stretch long across the creaking wooden floors. A flickering chandelier sways above as an eerie whisper drifts through the halls: "No one leaves until the past is put to rest..."

This is no ordinary mansion — it's a puzzle-filled prison where every room hides secrets, riddles, and echoes of a forgotten history. Your only hope lies in solving the mysteries within five haunted chambers, each one more chilling than the last. Time is running out. Can you outwit the mansion before it claims you as its next ghost?

Welcome to Escape the Haunted Mansion.
Face the puzzles. Uncover the truth. Escape — or be trapped forever.

---

##  Features

-  Visually enhanced UI (dark gothic theme with CSS)
-  Puzzle Room with interactive logic
-  SQLite-based Login & Register system
-  MVC structure using JavaFX + FXML
-  Smooth scene transitions
-  Judge-friendly layout for demos

---

##  How to Run

### 🔧 Requirements
- Java 11 or newer
- JavaFX SDK installed (https://openjfx.io/)
- SQLite JDBC driver (included or downloadable)

### 🛠 Compile & Run

**Linux/macOS:**
```bash
./run.sh
```

**Windows:**
```bash
run.bat
```

Or use an IDE like IntelliJ or Eclipse:
- Import as a Maven or Gradle project (if build file added)
- Add JavaFX libraries to the build path
- Run `game.MainMenuController` via FXML entry point

---

##  Project Structure
```
src/
 └── main/
     ├── java/
     │    └── game/                # JavaFX controllers
     │    └── game/database/       # LoginManager
     └── resources/
          ├── fxml/                # UI layouts
          ├── css/                 # Theme styling
          └── assets/              # Images/audio
```

---


