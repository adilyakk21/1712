package ru.shafigullina.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumControler {

    @FXML
    private TextField nTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int number = Integer.parseInt(nTextField.getText().toString());
        int firstDigit = number / 100;
        int lastTwoDigits = number % 100;
        int resButton= lastTwoDigits * 10 + firstDigit;
        resLabel.setText("Новый номер=" + resButton);
    }

}
