module org.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.jfoenix;

    opens org.example.javafx to javafx.fxml;
    exports org.example.javafx;
}