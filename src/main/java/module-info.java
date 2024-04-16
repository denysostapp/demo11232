module com.example.demo11232 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo11232 to javafx.fxml;
    exports com.example.demo11232;
}