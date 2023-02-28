package Admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminSearchModifyRoomFormController {
    public AnchorPane adminModifyRoomFormID;
    public TextField enterRoomID;

    public void adminNextModifyRoomFormGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminModifyRoomFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminRoomsForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminNextModifyRoomFormGoHomeButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminModifyRoomFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminNextModifyRoomButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminModifyRoomFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminModifyRoomForm.fxml"))));
        stage.centerOnScreen();
    }
}
