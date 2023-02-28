package Admin;

import javaClass.CheckPasswordAndUserName;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminFrogotPasswordFormController {
    public TextField adminEnterNewPassword;
    public TextField adminReEnterNewPassword;
    public AnchorPane AdminFrogotPasswordPaneID;

    public void AdminFrogotPasswordNextButtonOnAction(ActionEvent actionEvent) throws IOException {
        CheckPasswordAndUserName checkPasswordAndUserName=new CheckPasswordAndUserName();
        if (adminEnterNewPassword.getText().equals(adminReEnterNewPassword.getText())) {
            checkPasswordAndUserName.setPassword(adminEnterNewPassword.getText());
            System.out.println(adminEnterNewPassword.getText());
            Stage stage=(Stage) AdminFrogotPasswordPaneID.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminForgetPasswordSuccessful.fxml"))));
            stage.centerOnScreen();
        }else {
            adminEnterNewPassword.setText(null);
            adminReEnterNewPassword.setText(null);
        }



    }

    public void AdminFrogotPasswordGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) AdminFrogotPasswordPaneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminFrogotPasswordEmailVerifycation.fxml"))));
        stage.centerOnScreen();
    }
}
