package ru.shafigullina.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField kTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int k = Integer.parseInt(kTextField.getText().toString());
        int N = (k % 7 + 6) % 7;
        if (N == 0) {
            N = 7;
        }
        resLabel.setText("Номер дня недели: " + N);
    }

}
