module com.example.rotation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rotation to javafx.fxml;
    exports com.example.rotation;
}