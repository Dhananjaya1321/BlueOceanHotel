package Receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistGuestPrintTokenOrMailReceiptFormController {
    public AnchorPane ReceptionistGuestPrintTokenOrMileReceipFormID;

    public void receptioistGuestPrintTokenOrMileReceipFormGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) ReceptionistGuestPrintTokenOrMileReceipFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AddGuestPurchaseDetailsForm.fxml"))));
        stage.centerOnScreen();
    }

    public void receptioistGuestPrintTokenOrMileReceipFormGoHomeButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) ReceptionistGuestPrintTokenOrMileReceipFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void ReceptionistGuestMileReceipButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) ReceptionistGuestPrintTokenOrMileReceipFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistGuestMailReceiptSuccessfulForm.fxml"))));
        stage.centerOnScreen();

    }

    public void ReceptionistGuestPrintTokenButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) ReceptionistGuestPrintTokenOrMileReceipFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistGuestPrintTokenSuccseefulForm.fxml"))));
        stage.centerOnScreen();
    }
}
