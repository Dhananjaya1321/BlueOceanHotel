package Admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminFrogotPasswordEmailVerifycationController {

    public TextField adminLogInUserName;
    public TextField adminLonInPassword;
    public AnchorPane AdminFrogotPasswordEmailVerifycationPAneID;

    public void AdminFrogotPasswordEmailVerifycationNextButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) AdminFrogotPasswordEmailVerifycationPAneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminFrogotPasswordForm.fxml"))));
        stage.centerOnScreen();
    }

    public void AdminFrogotPasswordEmailVerifycationSendButtonOnAction(ActionEvent actionEvent) {

    }

    public void AdminFrogotPasswordEmailVerifycationGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) AdminFrogotPasswordEmailVerifycationPAneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminLonInForm.fxml"))));
        stage.centerOnScreen();
    }
}
