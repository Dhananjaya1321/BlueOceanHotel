package Admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminForgetPasswordSuccessfulController {
    public AnchorPane adminChangePasswordSuccessPaneID;

    public void adminChangePasswordGoToLogInButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminChangePasswordSuccessPaneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminLonInForm.fxml"))));
        stage.centerOnScreen();
    }
}
