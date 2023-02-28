package Receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistLogInFormController {

    public AnchorPane receptionistLogInPaneID;
    public TextField receptionistLonInPassword;
    public TextField receptionistLogInUserName;

    public void receptionistLogInButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptionistLogInPaneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void receptionistLogInForgotPasswordOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptionistLogInPaneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistFrogotPasswordEmailVerifycationController.fxml"))));
        stage.centerOnScreen();
    }

    public void receptionistGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptionistLogInPaneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../OptionsForm.fxml"))));
        stage.centerOnScreen();
    }
}
