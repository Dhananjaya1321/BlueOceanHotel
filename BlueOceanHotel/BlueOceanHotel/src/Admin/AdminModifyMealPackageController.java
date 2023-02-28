package Admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminModifyMealPackageController {

    public TextField enterMealPackageID;
    public AnchorPane adminModifyMealPlansFormID;

    public void adminNextModifyMealPackageFormGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminModifyMealPlansFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminMealPackagesForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminNextModifyMealPackageFormGoHomeButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminModifyMealPlansFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminNextModifyMealPackageButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminModifyMealPlansFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminModifyMealPackageForm.fxml"))));
        stage.centerOnScreen();
    }
}

