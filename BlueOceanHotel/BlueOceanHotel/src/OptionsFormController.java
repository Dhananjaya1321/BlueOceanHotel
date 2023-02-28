import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class OptionsFormController {
    public AnchorPane OptionsFormPaneID;

    public void AdminButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) OptionsFormPaneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Admin/AdminLonInForm.fxml"))));
        stage.centerOnScreen();
    }

    public void ReceptionistButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) OptionsFormPaneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Receptionist/ReceptionistLogInForm.fxml"))));
        stage.centerOnScreen();
    }
}
