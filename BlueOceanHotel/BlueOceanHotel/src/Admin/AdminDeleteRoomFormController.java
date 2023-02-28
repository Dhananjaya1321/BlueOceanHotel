package Admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDeleteRoomFormController {
    public AnchorPane adminDeleteRoomFormID;
    public TextField enterRoomID;

    public void adminDeleteRoomFormGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminDeleteRoomFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminRoomsForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminDeleteRoomFormGoHomeButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminDeleteRoomFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminDeleteRoomButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminDeleteRoomFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminDeleteRoomSuccessfulForm.fxml"))));
        stage.centerOnScreen();

    }
}
