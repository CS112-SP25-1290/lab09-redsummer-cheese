package cs112.lab09.controllers;

import cs112.lab09.RedSummer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private Button startButton;

    @FXML
    private ImageView titleImageView;

    @FXML
    private void initialize() {
        titleImageView.setImage(new Image("/images/red_summer_title.png"));
    }

    @FXML
    private void handleStartButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MapView.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = (Stage) startButton.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Red Summer - U.S. Map");
        stage.show();
    }
}
