package Receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistGuestPrintTokenSuccseefulFormController {
    public AnchorPane ReceptionistGuestPrintTokenOrMileReceipFormID;

    public void PrintTokenSuccessfulOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) ReceptionistGuestPrintTokenOrMileReceipFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistHomeForm.fxml"))));
        stage.centerOnScreen();
    }
}
