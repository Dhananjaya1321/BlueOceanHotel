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

public class AdminAddMealPackagesController {
    public AnchorPane adminAddMealPackageForm;
    public TextField enterMealPackageID;
    public TextArea typeDescriptionTextAreaID;
    public TextField enterPriceMealPackage;
    public RadioButton selectLocalMealsID;
    public ToggleGroup mealPlans;
    public RadioButton selectChineseMealsID;
    public RadioButton selectFrenchMealsID;
    public TextField enterMealPackageName;

    public void adminAddMealPackageFormGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminAddMealPackageForm.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminMealPackagesForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminAddMealPackegeFormGoHomeButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminAddMealPackageForm.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void adminAddMealPackageButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) adminAddMealPackageForm.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminAddingMealPackageSuccseefulForm.fxml"))));
        stage.centerOnScreen();
    }
}
