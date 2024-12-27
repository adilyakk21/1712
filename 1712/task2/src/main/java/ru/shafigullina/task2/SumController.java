package ru.shafigullina.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField nTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(nTextField.getText().toString());
        int lastDigit = N % 10;
        int firstTwoDigits = N/ 10;
        int resButton = lastDigit * 100 + firstTwoDigits;
        resLabel.setText("Новый номер=" + resButton);
    }

}
