package com.example.pizzaapplication;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button agentButton;

    @FXML
    private Button chefButton;

    @FXML
    private Button studentButton;

    @FXML
    private Label welcomeLable;





    public void studentButtonClicked() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("loginVerification.fxml"));
        Stage stage = (Stage) studentButton.getScene().getWindow();
        stage.setScene(new Scene(fxmlLoader.load(), 662, 437));

    }
    public void agentButtonClicked() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("loginVerification.fxml"));
        Stage stage = (Stage) agentButton.getScene().getWindow();
        stage.setScene(new Scene(fxmlLoader.load(), 662, 437));
    }

    public void chefButtonClicked() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("loginVerification.fxml"));
        Stage stage = (Stage) chefButton.getScene().getWindow();
        stage.setScene(new Scene(fxmlLoader.load(), 662, 437));
    }

}
