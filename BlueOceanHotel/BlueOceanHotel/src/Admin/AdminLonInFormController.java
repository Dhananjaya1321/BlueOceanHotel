package Admin;

import javaClass.CheckPasswordAndUserName;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminLonInFormController {
    public TextField adminLogInUserName;
    public TextField adminLonInPassword;
    public AnchorPane AdminLogInPaneID;
    public AnchorPane AdminLogInRigthPaneID;

    public void adminLogInForgotPasswordOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) AdminLogInPaneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminFrogotPasswordEmailVerifycation.fxml"))));
        stage.centerOnScreen();
    }

    public void adminLogInButtonOnAction(ActionEvent actionEvent) throws IOException {

//        System.out.println(adminLogInUserName.getText());
//        System.out.println(adminLonInPassword.getText());

        CheckPasswordAndUserName checkPasswordAndUserName=new CheckPasswordAndUserName();
        if (checkPasswordAndUserName.getPassword().equals(adminLonInPassword.getText()) && checkPasswordAndUserName.getUserName().equals(adminLogInUserName.getText())) {
            Stage stage=(Stage) AdminLogInPaneID.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminHomeForm.fxml"))));
            stage.centerOnScreen();
        }else{
            adminLogInUserName.setText(null);
            adminLonInPassword.setText(null);
        }

    }

    public void adminGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) AdminLogInPaneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../OptionsForm.fxml"))));
        stage.centerOnScreen();
    }
}
