package Receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistViewMealPackagesFormController {
    public AnchorPane receptioistViewMealsFormID;

    public void receptioistViewMealsFormGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptioistViewMealsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void receptioistViewMealsFormGoHomeButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptioistViewMealsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void receptionistLocalMealButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptioistViewMealsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistSelectLocalMealsForm.fxml"))));
        stage.centerOnScreen();
    }

    public void receptionistFrenchMealButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptioistViewMealsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistSelectFrenchMealsForm.fxml"))));
        stage.centerOnScreen();
    }

    public void receptionistChineseMealButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) receptioistViewMealsFormID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistSelectChineseMeals-Form.fxml"))));
        stage.centerOnScreen();
    }
}
