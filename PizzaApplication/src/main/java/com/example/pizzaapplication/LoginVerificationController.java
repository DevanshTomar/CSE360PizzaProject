package com.example.pizzaapplication;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginVerificationController {

    @FXML
    private Button submitButton;

    @FXML
    private TextField submitedId = new TextField();

    @FXML
    private Button checkButton;

    @FXML
    private TextField orderNumber = new TextField();

    private Database db = new Database();
    private String actor;

    private String id;


    public void submitButtonClicked() throws IOException {
        if(submitedId.getText().startsWith("ASU")){
            actor = "student";
            setId(submitedId.getText());
            if(db.searchId(this.id, actor)){
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("StudentLandingPage.fxml"));
                Stage stage = (Stage) submitButton.getScene().getWindow();
                stage.setScene(new Scene(fxmlLoader.load(), 662, 437));
            }
            else{
                System.out.println("Not a student");
            }
        }
        else if(submitedId.getText().startsWith("AGENT")){
            actor = "agent";
            setId(submitedId.getText());
            if(db.searchId(this.id, actor)){
                System.out.println("Agent");
            }
            else{
                System.out.println("Not an agent");
            }
        }
        else if(submitedId.getText().startsWith("CHEF")){
            actor = "chef";
            setId(submitedId.getText());
            if(db.searchId(this.id, actor)){
                System.out.println("Chef");
            }
            else{
                System.out.println("Not a chef");
            }
        }
        else{
            System.out.println("Invalid ID");
        }
    }

    public void checkButtonClicked() throws IOException {
        System.out.println("Checked");
    }


    private void setId(String id){
        this.id = id;
    }
}
