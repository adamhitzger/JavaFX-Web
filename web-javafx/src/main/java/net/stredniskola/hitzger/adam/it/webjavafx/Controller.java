package net.stredniskola.hitzger.adam.it.webjavafx;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.*;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TextField input;

    @FXML
    private WebView webView;

    private WebEngine engine;

    private WebHistory history;

    private double webZoom;

    private String homepage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        engine = webView.getEngine();
        homepage = "www.google.com";
        input.setText(homepage);
        webZoom = 1.0;
        loadPage();
    }
    @FXML
    public void back(ActionEvent event) {
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        history.go(-1);
        input.setText(entries.get(history.getCurrentIndex()).getUrl());
    }

    @FXML
    public void loadPage() {
        engine.load("http://" + input.getText());
    }

    @FXML
    public void next(ActionEvent event) {
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        history.go(1);
        input.setText(entries.get(history.getCurrentIndex()).getUrl());
    }

    @FXML
    public void refresh(ActionEvent event) {
        engine.reload();
    }

    @FXML
    public void zoomIn(ActionEvent event) {
        webZoom += 0.15;
        webView.setZoom(webZoom);
    }

    @FXML
    public void zoomOut(ActionEvent event) {
        webZoom -= 0.15;
        webView.setZoom(webZoom);
    }
}