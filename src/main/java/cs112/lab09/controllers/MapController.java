package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MapController {

    @FXML
    private ImageView mapImageView;

    @FXML
    private Button chicagoButton;

    @FXML
    private Button omahaButton;

    @FXML
    private Button washingtonDCButton;

    @FXML
    private Button elaineButton;

    @FXML
    private void initialize() {
        mapImageView.setImage(new Image("/images/us_map.png"));
    }

    @FXML
    private void handleCityButton(javafx.event.ActionEvent event) throws IOException {
        Button source = (Button) event.getSource();
        String city = source.getId().replace("Button", "").toLowerCase();
        RevisedHistoricalEvent eventData = RedSummer.getEvent(city);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CityView.fxml"));
        Stage dialogStage = new Stage();
        dialogStage.initModality(Modality.APPLICATION_MODAL);
        dialogStage.setTitle(eventData.getCity());

        Scene scene = new Scene(loader.load());
        dialogStage.setScene(scene);

        CityController controller = loader.getController();
        controller.setEvent(eventData);

        dialogStage.showAndWait();
    }
}
