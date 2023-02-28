package Receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistForgotPasswordFormController {
    public AnchorPane ReceptionisFrogotPasswordPaneID;
    public TextField ReceptionisEnterNewPassword;
    public TextField ReceptionisReEnterNewPassword;

    public void ReceptionisFrogotPasswordNextButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) ReceptionisFrogotPasswordPaneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistFrogotPasswordSuccessful.fxml"))));
        stage.centerOnScreen();
    }

    public void ReceptionisFrogotPasswordGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) ReceptionisFrogotPasswordPaneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistFrogotPasswordEmailVerifycationController.fxml"))));
        stage.centerOnScreen();
    }
}
