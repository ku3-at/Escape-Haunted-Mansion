
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



🕹️ Game Instructions: Escape Haunted Mansion
🔐 1. Launching the Game
Open the project in IntelliJ IDEA or Eclipse.

Ensure JavaFX libraries are added correctly to your module path.

Locate and run the Main class to launch the game.

🧑‍💻 2. Logging In
Before playing, each user must log in by entering their username:

When the game starts, you will be greeted with a Login Screen.

Enter your name in the text field labeled "Enter your name" or similar.

Click the “Start” or “Login” button.

Your session begins, and your name may be used to track progress or personalize your experience.

✅ Note: There's no password – just enter a name to begin playing.

🗝️ 3. How to Play
The game consists of five puzzle rooms.

Each room contains a unique challenge (e.g., code cracking, riddles, math puzzles).

Solve each room’s puzzle to unlock the door to the next room.

Clues may be hidden in text, UI elements, or previous rooms.

Use logical thinking, pattern recognition, and math skills.

💡 Tips
You must solve the current puzzle to move forward — there’s no skipping.

Read the on-screen instructions carefully for each room.

If you're stuck, look for clues in the room — they’re often subtle.

💾 Saving Progress
This version does not support save/load, so be sure to complete the game in one session.



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


