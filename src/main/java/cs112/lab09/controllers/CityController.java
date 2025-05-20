package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CityController {

    @FXML
    private Label titleLabel;

    @FXML
    private Label dateLabel;

    @FXML
    private Label summaryLabel;

    @FXML
    private ImageView imageView;

    @FXML
    private Button closeButton;

    private RevisedHistoricalEvent event;

    public void setEvent(RevisedHistoricalEvent event) {
        this.event = event;
        titleLabel.setText(event.getTitle());
        dateLabel.setText(event.getDate().toString());
        summaryLabel.setText(event.getSummary());
        imageView.setImage(new Image(Constants.IMAGE_PATH + event.getImageFileName()));
    }

    @FXML
    private void closeWindow() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
