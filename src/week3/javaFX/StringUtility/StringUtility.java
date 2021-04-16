package week3.javaFX.StringUtility;

import java.util.Arrays;
import java.util.stream.Collectors;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StringUtility extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(25, 25, 25, 25));
        hBox.setAlignment(Pos.CENTER);
        
        VBox vbox1 = new VBox();
        vbox1.setPadding(new Insets(25, 25, 25, 25));
        vbox1.setAlignment(Pos.CENTER);
        vbox1.setSpacing(10);
        
        VBox vbox2 = new VBox();
        vbox2.setPadding(new Insets(25, 25, 25, 25));
        vbox2.setAlignment(Pos.CENTER);
        
        hBox.getChildren().add(vbox1);
        hBox.getChildren().add(vbox2);
        
        grid.add(hBox, 0, 0);
        
        Label inputLabel = new Label("Input");
        Label outputLabel = new Label("Output");
        
        
        TextField inputTextField = new TextField();
        TextField outputTextField = new TextField();
        
        Button countButton = new Button("Count Letters");
        countButton.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent e) {
        		outputTextField.setText(inputTextField.getText().length()+"");
        	}
        });

        Button reverseButton = new Button("Reverse Letters");
        reverseButton.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent e) {
        		outputTextField.setText(new StringBuilder(inputTextField.getText()).reverse().toString());
        	}
        });
        Button removeDupButton = new Button("Remove Duplicates");
        removeDupButton.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent e) {
        		String input = inputTextField.getText();
        		String output = Arrays.asList(input.split(""))
                        .stream()
                        .distinct()
                        .collect(Collectors.joining());
        		
        		outputTextField.setText(output);
        	}
        });
     
        //hbox1
        vbox1.getChildren().add(countButton);
        vbox1.getChildren().add(reverseButton);
        vbox1.getChildren().add(removeDupButton);
                
        //Hbox2
        vbox2.getChildren().add(inputLabel);
        vbox2.getChildren().add(inputTextField);
        
        vbox2.getChildren().add(outputLabel);
        vbox2.getChildren().add(outputTextField);
        
        //Scene scene = new Scene(grid, 300, 200);
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}