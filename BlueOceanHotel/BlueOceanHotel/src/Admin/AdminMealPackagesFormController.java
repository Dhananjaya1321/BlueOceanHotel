package Admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminMealPackagesFormController {
    //public AnchorPane adminMealPackageFormID;
    public AnchorPane adminMealPackageForm;

    public void adminMealPackageFormGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminMealPackageForm.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminMealPackageFormGoHomeButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminMealPackageForm.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminAddMealPackageButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminMealPackageForm.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminAddMealPackages.fxml"))));
        stage.centerOnScreen();
    }

    public void adminModifyMealPackageButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminMealPackageForm.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("adminModifyMealPackage.fxml"))));
        stage.centerOnScreen();
    }

    public void adminDeleteMealPackageButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminMealPackageForm.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminDeleteMealPackage.fxml"))));
        stage.centerOnScreen();


    }
}
