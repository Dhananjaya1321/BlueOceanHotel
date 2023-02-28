package Admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminIncomeRrportsFormController {

    public AnchorPane adminIncomeReportsFormID;

    public void adminIncomeReportsFormGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminIncomeReportsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminIncomeReportsFormGoHomeButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminIncomeReportsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminMonthlyIncomeReportsButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminIncomeReportsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminViewMonthlyIncomeReportsForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminAnnualyIncomeReportsButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminIncomeReportsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminViewsAnnualyIncomeReportsForm.fxml"))));
        stage.centerOnScreen();

    }
}
