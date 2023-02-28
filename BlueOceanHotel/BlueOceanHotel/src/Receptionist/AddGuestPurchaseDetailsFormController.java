package Receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AddGuestPurchaseDetailsFormController {
    public AnchorPane ReceptionistAddGuestPurchaseDetailsFormID;
    public TextField roomID;
    public TextArea mealIDs;
    public TextField hoeManyGightAreThere;

    public void receptioistAddGuestPurchaseDetailsFormGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) ReceptionistAddGuestPurchaseDetailsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistAddGuestDetailsForm.fxml"))));
        stage.centerOnScreen();
    }

    public void receptioistAddGuestPurchaseDetailsFormGoHomeButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) ReceptionistAddGuestPurchaseDetailsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void ReceptionistAddGuestPurchaseDetailsSaveAndNextButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) ReceptionistAddGuestPurchaseDetailsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistGuestPrintTokenOrMailReceiptForm.fxml"))));
        stage.centerOnScreen();
    }
}
