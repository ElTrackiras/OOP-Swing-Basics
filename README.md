# Java Swing Tutorial: Simple Login Form

A beginner-friendly Java Swing tutorial. It builds a small login window with a text field and a button. When you click **Submit**, the program prints whatever you typed to the console.

## What It Does

1. Opens a window titled **"My System"**.
2. Shows a label, a text field for a username, and a **Submit** button.
3. When you click **Submit**, it prints this to the console:
   ```
   Login Attempt!
   <whatever you typed in the text field>
   ```

## Concepts Covered

- Making a window with `JFrame`
- Adding components: `JLabel`, `JTextField`, `JButton`
- Placing components by hand with a `null` layout and `setBounds()`
- Handling button clicks with `addActionListener` and a lambda
- Reading user input with `getText()`

## Project Structure

```
JavaSwingTutorial/
├── src/
│   ├── App.java         # Entry point: creates and shows the login form
│   └── LoginForm.java   # The Swing window and the button-click logic
└── bin/                 # Compiled .class files
```

## Requirements

- Java JDK 8 or later (lambdas need Java 8+)

## How to Run

### From the command line

```bash
javac -d bin src/*.java
```

```bash
java -cp bin App
```

### In VS Code

Open the folder with the [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) installed, open `src/App.java`, and click **Run**.

## Code Overview

**`App.java`** creates the form and shows it:

```java
LoginForm myapp = new LoginForm();
myapp.displayLogin();
```

**`LoginForm.java`** connects the button to a method that reads the text field:

```java
submitBtn.addActionListener(e -> login_process());

public void login_process() {
    System.out.println("Login Attempt!");
    String username_value = usernameField.getText();
    System.out.println(username_value);
}
```

## Ideas for Next Steps

- Add a `JPasswordField` for a password
- Show the result in a `JOptionPane` dialog instead of the console
- Check the input against a hard-coded username
- Try a layout manager such as `FlowLayout` or `GridLayout` instead of `null`
