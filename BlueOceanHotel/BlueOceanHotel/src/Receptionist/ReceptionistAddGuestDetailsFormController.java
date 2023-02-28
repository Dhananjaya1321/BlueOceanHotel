package Receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistAddGuestDetailsFormController{
    public AnchorPane ReceptionistAddGuestDetailsFormID;
    public TextField name;
    public TextField phoneNumber;
    public TextField NIC;
    public TextField eMail;
    public TextField address;

    public void receptioistAddGuestDetailsFormGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) ReceptionistAddGuestDetailsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void receptioistAddGuestDetailsFormGoHomeButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) ReceptionistAddGuestDetailsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void ReceptionistAddGuestDetailsSaveAndNextButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) ReceptionistAddGuestDetailsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AddGuestPurchaseDetailsForm.fxml"))));
        stage.centerOnScreen();
    }
}
