module com.example.fis {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fis to javafx.fxml;
    exports com.example.fis;
}