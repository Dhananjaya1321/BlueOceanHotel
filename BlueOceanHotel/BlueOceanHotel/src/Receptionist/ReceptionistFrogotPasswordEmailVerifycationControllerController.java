package Receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistFrogotPasswordEmailVerifycationControllerController {
    public AnchorPane ReceptionistFrogotPasswordEmailVerifycationPAneID;
    public TextField ReceptionistLogInUserName;
    public TextField ReceptionistLonInPassword;

    public void ReceptionistFrogotPasswordEmailVerifycationNextButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) ReceptionistFrogotPasswordEmailVerifycationPAneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistForgotPasswordForm.fxml"))));
        stage.centerOnScreen();
    }

    public void ReceptionistFrogotPasswordEmailVerifycationSendButtonOnAction(ActionEvent actionEvent) {

    }

    public void ReceptionistFrogotPasswordEmailVerifycationGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) ReceptionistFrogotPasswordEmailVerifycationPAneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistLogInForm.fxml"))));
        stage.centerOnScreen();
    }
}
