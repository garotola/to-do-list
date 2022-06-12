package views;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class ViewController implements Initializable{

    //ArrayList<CheckBox> list = new ArrayList<>();
    private int cont = 0;
    @FXML private TextField textField;
    @FXML private Button buttonAdd;
    @FXML private GridPane gridPane; 
    @FXML private Button buttonReset;

    public EventHandler<ActionEvent> onActionButtonAdd(){
        return new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                gridPane.add(new CheckBox(cont + ". " + textField.getText()), 0, cont);
                cont++;
            }
        };   
    }

    public EventHandler<ActionEvent> onActionButtonReset(){
        return new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                
            }
        };   
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        buttonAdd.setOnAction(onActionButtonAdd());
        //buttonReset.setOnAction(value);
    }
}