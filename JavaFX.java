package calcProject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple Calculator");

        // Create the Calculator object
        Calculator calculator = new Calculator(0, 0);

        // Create UI elements
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(8);

        TextField num1Input = new TextField();
        num1Input.setPromptText("Enter number 1");
        GridPane.setConstraints(num1Input, 0, 0);

        TextField num2Input = new TextField();
        num2Input.setPromptText("Enter number 2");
        GridPane.setConstraints(num2Input, 0, 1);

        Button addButton = new Button("Add");
        GridPane.setConstraints(addButton, 1, 0);

        Button subtractButton = new Button("Subtract");
        GridPane.setConstraints(subtractButton, 2, 0);

        Button multiplyButton = new Button("Multiply");
        GridPane.setConstraints(multiplyButton, 1, 1);

        Button divideButton = new Button("Divide");
        GridPane.setConstraints(divideButton, 2, 1);

        Label resultLabel = new Label("Result: ");
        GridPane.setConstraints(resultLabel, 0, 2);

        // Event handlers for calculator operations
        addButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(num1Input.getText());
                double num2 = Double.parseDouble(num2Input.getText());
                calculator = new Calculator(num1, num2);
                double result = calculator.add();
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Result: Invalid input");
            }
        });

        subtractButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(num1Input.getText());
                double num2 = Double.parseDouble(num2Input.getText());
                calculator = new Calculator(num1, num2);
                double result = calculator.subtract();
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Result: Invalid input");
            }
        });

        multiplyButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(num1Input.getText());
                double num2 = Double.parseDouble(num2Input.getText());
                calculator = new Calculator(num1, num2);
                double result = calculator.multiply();
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Result: Invalid input");
            }
        });

        divideButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(num1Input.getText());
                double num2 = Double.parseDouble(num2Input.getText());
                calculator = new Calculator(num1, num2);
                double result = calculator.divide();
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException | ArithmeticException ex) {
                resultLabel.setText("Result: " + ex.getMessage());
            }
        });

        // Add UI elements to the grid
        grid.getChildren().addAll(num1Input, num2Input, addButton, subtractButton, multiplyButton, divideButton, resultLabel);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

