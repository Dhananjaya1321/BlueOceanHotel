package Admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDeleteMealPackageController {
    public AnchorPane adminDeleteMealPlansFormID;
    public TextField enterMealPackageID;

    public void adminDeleteMealPackageFormGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminDeleteMealPlansFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminMealPackagesForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminDeleteMealPackageFormGoHomeButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminDeleteMealPlansFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminHomeForm.fxml"))));
        stage.centerOnScreen();

    }

    public void adminDeleteMealPackageButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminDeleteMealPlansFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminDeleteMealPackageSuccessfulForm.fxml"))));
        stage.centerOnScreen();
    }
}
