module org.example.otp2fuelconsumption {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.otp2fuelconsumption to javafx.fxml;
    exports org.example.otp2fuelconsumption;
}