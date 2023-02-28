package Receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistSelectLocalMealsFormController {
    public AnchorPane paneID;
    public TableColumn roomID;
    public TableColumn description;
    public TableColumn PriceOfOneNight;

    public void GoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) paneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistViewMealPackagesForm.fxml"))));
        stage.centerOnScreen();
    }

    public void GoHomeButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) paneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistHomeForm.fxml"))));
        stage.centerOnScreen();
    }
}
