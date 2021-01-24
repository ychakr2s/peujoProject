package controller;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class composantController implements Initializable {
    private ArrayList<ComboBox> ArrayListCombo;
    @FXML
    public ComboBox comp1;
    ObservableList compo1 = FXCollections.observableArrayList("0", "OK", "M", "R");

    @FXML
    private ComboBox comp2;
    ObservableList<String> compo2 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp3;
    ObservableList<String> compo3 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp4;
    ObservableList<String> compo4 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp5;
    ObservableList<String> compo5 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp6;
    ObservableList<String> compo6 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp7;
    ObservableList<String> compo7 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp8;
    ObservableList<String> compo8 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp9;
    ObservableList<String> compo9 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp10;
    ObservableList<String> compo10 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp11;
    ObservableList<String> compo11 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp12;
    ObservableList<String> compo12 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp13;
    ObservableList<String> compo13 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp14;
    ObservableList<String> compo14 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp15;
    ObservableList<String> compo15 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp16;
    ObservableList<String> compo16 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp17;
    ObservableList<String> compo17 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp18;
    ObservableList<String> compo18 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp19;
    ObservableList<String> compo19 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp20;
    ObservableList<String> compo20 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp21;
    ObservableList<String> compo21 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");
    @FXML
    private ComboBox comp22;
    ObservableList<String> compo22 = FXCollections.observableArrayList("0", "OK", "M", "R", "S", "F", "2S", "2F");

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comp1.setItems(compo1);
        comp2.setItems(compo2);
        comp3.setItems(compo3);
        comp4.setItems(compo4);
        comp5.setItems(compo5);
        comp6.setItems(compo6);
        comp7.setItems(compo7);
        comp9.setItems(compo9);
        comp10.setItems(compo10);
        comp11.setItems(compo11);
        comp12.setItems(compo12);
        comp13.setItems(compo13);
        comp14.setItems(compo14);
        comp15.setItems(compo15);
        comp16.setItems(compo16);
        comp17.setItems(compo17);
        comp18.setItems(compo18);
        comp19.setItems(compo19);
        comp20.setItems(compo20);
        comp21.setItems(compo21);
        comp22.setItems(compo22);

        for (ComboBox com : getArrayListCombo()) {
            generalComp(com);
        }
    }

    public ArrayList<ComboBox> getArrayListCombo() {
        ArrayListCombo = new ArrayList<>();

        ArrayListCombo.add(comp1);
        ArrayListCombo.add(comp2);
        ArrayListCombo.add(comp3);
        ArrayListCombo.add(comp4);
        ArrayListCombo.add(comp5);
        ArrayListCombo.add(comp6);
        ArrayListCombo.add(comp7);
        ArrayListCombo.add(comp8);
        ArrayListCombo.add(comp9);
        ArrayListCombo.add(comp10);
        ArrayListCombo.add(comp11);
        ArrayListCombo.add(comp12);
        ArrayListCombo.add(comp13);
        ArrayListCombo.add(comp14);
        ArrayListCombo.add(comp15);
        ArrayListCombo.add(comp16);
        ArrayListCombo.add(comp17);
        ArrayListCombo.add(comp18);
        ArrayListCombo.add(comp19);
        ArrayListCombo.add(comp20);
        ArrayListCombo.add(comp21);
        ArrayListCombo.add(comp22);

        return this.ArrayListCombo;
    }

    // This Methode shorts call of Methods
    public void generalComp(ComboBox comb) {
        selectColor(comb);
        setColor(comb);
    }

    // This Method sets Color
    public void setColor(ComboBox comp) {
        comp.buttonCellProperty().bind(Bindings.createObjectBinding(() -> {
            final Color finalColor = selectColor(comp);

            // Get the arrow button of the combo-box
            final StackPane arrowButton = (StackPane) comp.lookup(".arrow-button");

            return new ListCell<String>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);

                    if (empty || item == null) {
                        setBackground(Background.EMPTY);
                        setText("");
                    } else {
                        setBackground(new Background(new BackgroundFill(finalColor, CornerRadii.EMPTY, Insets.EMPTY)));
                        setText(item);
                    }

                    // Set the background of the arrow also
                    if (arrowButton != null)
                        arrowButton.setBackground(getBackground());
                }
            };
        }, comp.valueProperty()));
    }

    // This Method select Colors
    public Color selectColor(ComboBox comb) {
        int indexOf = comb.getItems().indexOf(comb.getValue());

        Color color = Color.TRANSPARENT;

        switch (indexOf) {
            case 1:
                color = Color.GREEN;
                break;
            case 2:
                color = Color.RED;
                break;
            case 3:
                color = Color.PINK;
                break;
            case 4:
                color = Color.ORANGE;
                break;
            case 5:
                color = Color.YELLOW;
                break;
            case 6:
                color = Color.ORANGE;
                break;
            case 7:
                color = Color.YELLOW;
                break;
            default:
                break;
        }
        return color;
    }

}
