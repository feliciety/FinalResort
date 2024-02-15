module fauget.final {
    requires javafx.controls;
    requires javafx.fxml;


    opens fauget.final to javafx.fxml;
    exports fauget.final;
}