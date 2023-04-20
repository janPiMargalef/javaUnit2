module com.mycompany.javaunit3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.javaunit3 to javafx.fxml;
    exports com.mycompany.javaunit3;
}
