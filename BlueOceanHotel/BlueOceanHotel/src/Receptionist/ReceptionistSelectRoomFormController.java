package Receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistSelectRoomFormController {
    public AnchorPane receptioistSelectRoomFormID;

    public void receptioistSelectRoomFormGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptioistSelectRoomFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void receptioistSelectRoomFormGoHomeButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptioistSelectRoomFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void receptionistSingleRoomButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptioistSelectRoomFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistSelectSingleBedRoomsForm.fxml"))));
        stage.centerOnScreen();

    }

    public void receptionistQuadRoomlButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptioistSelectRoomFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistSelectQuadBedRoomsForm.fxml"))));
        stage.centerOnScreen();
    }

    public void receptionistDoubleRoomButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptioistSelectRoomFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistSelectDoubleBedRoomsForm.fxml"))));
        stage.centerOnScreen();
    }

    public void receptionistTripleRoomButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptioistSelectRoomFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistSelectTripleBedRoomsForm.fxml"))));
        stage.centerOnScreen();
    }
}
