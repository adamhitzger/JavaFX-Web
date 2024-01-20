module net.stredniskola.hitzger.adam.it.webbrowser {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    opens net.stredniskola.hitzger.adam.it.webjavafx to javafx.fxml;
    exports net.stredniskola.hitzger.adam.it.webjavafx;
}