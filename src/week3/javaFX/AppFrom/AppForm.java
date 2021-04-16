package week3.javaFX.AppFrom;

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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AppForm extends Application {


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
        
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(25, 25, 25, 25));
        
        HBox hbox1 = new HBox();
        hbox1.setPadding(new Insets(25, 25, 25, 25));
        hbox1.setAlignment(Pos.CENTER);
        
        HBox hbox2 = new HBox();
        hbox2.setPadding(new Insets(25, 25, 25, 25));
        hbox2.setAlignment(Pos.CENTER);
        
        vbox.getChildren().add(hbox1);
        vbox.getChildren().add(hbox2);
        
        grid.add(vbox, 0, 0);
        
        TextField nameTextField = new TextField();
        TextField streetTextField = new TextField();
        TextField cityTextField = new TextField();
        TextField stateTextField = new TextField();
        TextField zipTextField = new TextField();
        
        Label nameLabel = new Label("Name:");
        
        
        Label cityLabel = new Label("City:");
        Label streetLabel = new Label("Street:");
        Label stateLabel = new Label("State:");
        Label zipLabel = new Label("Zip:");
        
     
        //hbox1
        hbox1.getChildren().add(nameLabel);
        hbox1.getChildren().add(nameTextField);
        
        hbox1.getChildren().add(streetLabel);
        hbox1.getChildren().add(streetTextField);
        
        hbox1.getChildren().add(cityLabel);
        hbox1.getChildren().add(cityTextField);
        
        //Hbox2
        hbox2.getChildren().add(stateLabel);
        hbox2.getChildren().add(stateTextField);
        
        hbox2.getChildren().add(zipLabel);
        hbox2.getChildren().add(zipTextField);
        
        
        Button btn = new Button("Submit");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_CENTER);
        hbBtn.getChildren().add(btn);
        vbox.getChildren().add(hbBtn);
        
        
        //"final" prevents modification by the handler
        final Text actiontarget = new Text();
        grid.add(actiontarget, 3, 1);
		btn.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent e) {
        		System.out.println(nameTextField.getText()+"\n"+ streetTextField.getText()+"\n"+
        				stateTextField.getText()+", "+cityTextField.getText()+" "+zipTextField.getText());
        	}
        });

        //Scene scene = new Scene(grid, 300, 200);
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}