package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    /*
     ** This is located in First Page and when you click this Button goes to Composant.
     */
    @FXML
    private Button btn1;


    //    public ComboBox<String> comp1;


    @FXML
    public void fillCombo() {
//        comp1.setItems(compo1);
        System.out.println("salam " );

//        comp1= new ComboBox<String>();
//        comp1.setItems(compo1);
    }

    @FXML
    private void handleButtonAction(ActionEvent event) throws Exception {
        Stage stage;
        Parent root;

        if (event.getSource() == btn1) {

            stage = (Stage) btn1.getScene().getWindow();
            stage.setTitle("Composant");
//            fillCombo();
//            stage.setScene();
//            fillCombo();
            URL url = new File("src/main/resources/fxml/qcl.fxml").toURI().toURL();
            root = FXMLLoader.load(url);

            Scene scene = new Scene(root);
            stage.setScene(scene);
            fillCombo();
            stage.show();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
