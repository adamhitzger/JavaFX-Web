package net.stredniskola.hitzger.adam.it.webjavafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.application.Application;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("browser.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Browser");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.getIcons().add(new Image(getClass().getResourceAsStream("images/browser.png")));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}