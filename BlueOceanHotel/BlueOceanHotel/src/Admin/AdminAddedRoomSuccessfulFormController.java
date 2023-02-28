package Admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminAddedRoomSuccessfulFormController {
    public AnchorPane paneID;


    public void goHomeButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) paneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void goBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) paneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminAddRooms.fxml"))));
        stage.centerOnScreen();
    }
}
