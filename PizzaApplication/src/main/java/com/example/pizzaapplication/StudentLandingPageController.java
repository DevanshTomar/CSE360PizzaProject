package com.example.pizzaapplication;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentLandingPageController {

    @FXML
    private ToggleButton checkStatusButton;

    @FXML
    private ToggleButton orderHereButton;

    public void Controller() throws IOException {
        if(orderHereButton.isSelected()){
            System.out.println("Order Here");
        }
        else if(checkStatusButton.isSelected()){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("StatusCheckVerification.fxml"));
            Stage stage = (Stage) checkStatusButton.getScene().getWindow();
            stage.setScene(new Scene(fxmlLoader.load(), 662, 437));
        }
    }

}

