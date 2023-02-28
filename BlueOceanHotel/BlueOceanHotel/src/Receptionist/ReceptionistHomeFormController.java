package Receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistHomeFormController {
    public AnchorPane receptionistHomeFormID;

    public void receptionistLogOutButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptionistHomeFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../OptionsForm.fxml"))));
        stage.centerOnScreen();
    }

    public void receptionistReserveRoomsButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptionistHomeFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistSelectRoomForm.fxml"))));
        stage.centerOnScreen();

    }

    public void receptionistRoomMaintanceButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptionistHomeFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistMakeAvailableRoomsMaintananceForm.fxml"))));
        stage.centerOnScreen();
    }

    public void receptionistAddGuestDetailButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptionistHomeFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistAddGuestDetailsForm.fxml"))));
        stage.centerOnScreen();

    }

    public void receptionistMealPackageButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptionistHomeFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistViewMealPackagesForm.fxml"))));
        stage.centerOnScreen();

    }

    public void receptionistViewGuestDetailButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptionistHomeFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistViewGuestDetailsForm.fxml"))));
        stage.centerOnScreen();

    }
}
