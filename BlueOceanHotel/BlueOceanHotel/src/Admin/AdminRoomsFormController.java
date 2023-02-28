package Admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class
AdminRoomsFormController {

    public AnchorPane adminRoomsFormID;

    public void adminRomsFormGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminRoomsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminRomsFormGoHomeButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminRoomsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminAddRomsButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminRoomsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminAddRooms.fxml"))));
        stage.centerOnScreen();

    }

    public void adminModifyRomsButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminRoomsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminSearchModifyRoomForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminDeleteRomsButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminRoomsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminDeleteRoomForm.fxml"))));
        stage.centerOnScreen();
    }
}
