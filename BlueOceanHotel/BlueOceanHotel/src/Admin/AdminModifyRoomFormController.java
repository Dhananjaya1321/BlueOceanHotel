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

public class AdminModifyRoomFormController {
    public AnchorPane adminModifyRoomsFormID;
    public TextField enterRoomID;
    public TextArea typeDescriptionTextAreaID;
    public TextField enterPriceOfOneNigthID;
    public RadioButton selectSingleRoomTypeID;
    public ToggleGroup roomTypes;
    public RadioButton selectDoubleRoomTypeID;
    public RadioButton selectQuadrupleRoomTypeID;
    public RadioButton selectTripelRoomTypeID;

    public void adminModifyRoomFormGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminModifyRoomsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminSearchModifyRoomForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminModifyRoomFormGoHomeButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminModifyRoomsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminUpdateRoomButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminModifyRoomsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminModifyRoomSuccessfulForm.fxml"))));
        stage.centerOnScreen();
    }
}
