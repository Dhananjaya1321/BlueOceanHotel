package Admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminAddRoomsController {
    public AnchorPane adminRoomsFormID;
    public ToggleGroup roomTypes;
    public TextField enterRoomID;
    public TextArea typeDescriptionTextAreaID;
    public TextField enterPriceOfOneNigthID;
    public RadioButton selectSingleRoomTypeID;
    public RadioButton selectDoubleRoomTypeID;
    public RadioButton selectQuadrupleRoomTypeID;
    public RadioButton selectTripelRoomTypeID;

    public void adminRomsFormGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminRoomsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminRoomsForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminRomsFormGoHomeButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminRoomsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminAddRomsButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminRoomsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminAddedRoomSuccessfulForm.fxml"))));
        stage.centerOnScreen();
    }
}
