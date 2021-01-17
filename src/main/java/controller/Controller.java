package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public ComboBox<String> comb;
    ObservableList<String> list = FXCollections.observableArrayList("0", "OK", "M", "R");

    @FXML
//    void Select (ActionEvent event){
//comb.setValue();   }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comb.setItems(list);
    }


}
