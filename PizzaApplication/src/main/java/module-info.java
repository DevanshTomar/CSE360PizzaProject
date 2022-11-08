module com.example.pizzaapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pizzaapplication to javafx.fxml;
    exports com.example.pizzaapplication;
}