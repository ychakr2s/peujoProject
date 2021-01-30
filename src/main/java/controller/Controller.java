package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    /*
     ** This is located in First Page and when you click this Button goes to Composant.
     */
    @FXML
    private Button btn1;
    @FXML
    private TextArea date;
    @FXML
    private TextArea conShift;
    @FXML
    private TextArea gravure;

    //    public ComboBox<String> comp1;


    @FXML
    public void fillCombo() {
//        comp1.setItems(compo1);
        System.out.println("salam ");

//        comp1= new ComboBox<String>();
//        comp1.setItems(compo1);
    }

    @FXML
    private void handleButtonAction(ActionEvent event) throws Exception {
        Stage stage;
        Parent root;

        if (event.getSource() == btn1) {
            if (gravure.getText().equals("")) {
                System.out.println("alles ist leeer" + gravure.getText());
            }
//            System.out.println("alles ist leeer" + gravure.getText());

            stage = (Stage) btn1.getScene().getWindow();
            stage.setTitle("Composant");
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
        date.setText(getStartDate());
        conShift.setText(String.valueOf(getShift()));
    }

    private int getShift() {
        int shift = 0;
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter forma = DateTimeFormatter.ofPattern("HH");
        String formattedDate = currentTime.format(forma);
        int time = Integer.parseInt(formattedDate);
        if (time >= 6 && time < 14) {
            shift = 1;
        } else if (time >= 14 && time < 22) {
            shift = 2;
        } else {
            shift = 3;
        }
        return shift;
    }

    private static String getStartDate() {
        Date date = new Date();
        SimpleDateFormat formater = new SimpleDateFormat("dd.MM.yyyy  hh:mm");
        String formatedDate = formater.format(date);
        return formatedDate;
    }
}
