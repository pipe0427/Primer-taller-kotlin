module com.example.ejercicios {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.ejercicios to javafx.fxml;
    exports com.example.ejercicios;
}