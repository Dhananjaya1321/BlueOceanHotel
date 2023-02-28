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

public class AdminModifyMealPackageFormController {
    public TextField enterMealPackageID;
    public TextArea typeDescriptionTextAreaID;
    public TextField enterPriceMealPackage;
    public RadioButton selectLocalMealsID;
    public ToggleGroup mealPlans;
    public RadioButton selectChineseMealsID;
    public RadioButton selectFrenchMealsID;
    public TextField enterPriceMealPackage1;
    public AnchorPane adminModifyMealPackageForm;

    public void adminModifyMealPackageFormGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminModifyMealPackageForm.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("adminModifyMealPackage.fxml"))));
        stage.centerOnScreen();
    }

    public void adminModifyMealPackegeFormGoHomeButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminModifyMealPackageForm.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminHomeForm.fxml"))));
        stage.centerOnScreen();

    }

    public void adminModifyMealPackageButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminModifyMealPackageForm.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminModifyMealPackageSuccessfulForm.fxml"))));
        stage.centerOnScreen();

    }
}
