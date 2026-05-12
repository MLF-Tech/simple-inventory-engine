# Simple Inventory Engine

A small Java project to practice basic object-oriented programming and simple inventory logic. Written with beginners in mind — especially self-taught developers who are just starting out.

Who this is for
- New developers learning Java and how to structure a small program.

Files
- Product.java — defines the Product object (fields, constructor, simple validation).
- InventoryManager.java — holds and updates products, handles stock changes.
- Main.java — a minimal entry point that shows example usage of the other classes.
- *.class files — compiled output. You don't need to edit these.

Prerequisites
- Java JDK installed (Java 11+ recommended). JDK 26 works too but is optional.
- A terminal (macOS Terminal, Windows PowerShell, or similar).

Quick start
1. Open a terminal in this folder.
2. Compile all Java sources: 
   javac *.java
3. Run the program:
   java Main

If Main is inside a package, run it with its full package name from the project root, for example:
   java com.example.Main

Common problems & quick fixes
- "javac: command not found": Install the JDK and add java/javac to your PATH.
- "NoClassDefFoundError" or "ClassNotFoundException": Make sure you are in the project root and that the .class files are present. Check package declarations at the top of .java files.
- Compilation errors show file names and line numbers — open that .java file and fix the code, then re-run javac.

Tips for learning and experimenting
- Edit Product.java or InventoryManager.java to add simple features (e.g., product description, stock thresholds).
- After changes, recompile with javac and run again.
- Add print statements in Main.java to see program flow while you learn.

Contributing / Next steps
- Improve tests or add simple example scenarios in Main.java.
- Add a CONTRIBUTING.md if you want contributors to follow specific steps.

—

Author: Maria Laura Fagioli

If you'd like this readme translated to Italian or shortened into a quick checklist, say so and it will be prepared.