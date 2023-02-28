package Receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistFrogotPasswordSuccessfulController {
    public AnchorPane receptionistChangePasswordSuccessPaneID;

    public void receptionistChangePasswordGoToLogInButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptionistChangePasswordSuccessPaneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistLogInForm.fxml"))));
        stage.centerOnScreen();
    }
}
