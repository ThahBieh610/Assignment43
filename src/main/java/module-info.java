module com.example.assignment43 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment43 to javafx.fxml;
    exports com.example.assignment43;
    exports com.example.assigment5;
    opens com.example.assigment5 to javafx.fxml;
}