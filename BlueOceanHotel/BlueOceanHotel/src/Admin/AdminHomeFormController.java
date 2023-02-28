package Admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminHomeFormController {

    public AnchorPane adminHomeFormID;

    public void adminRoomsButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminHomeFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminRoomsForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminIncomeReportsButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminHomeFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminIncomeRrportsForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminMealPackageButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminHomeFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminMealPackagesForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminLogOutButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminHomeFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../OptionsForm.fxml"))));
        stage.centerOnScreen();
    }
}
