package Receptionist;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class ReceptionistViewGuestDetailsFormController {
    public AnchorPane paneID;
    public TableColumn roomID;
    public TableColumn name;
    public TableColumn phoneNumber;
    public TableColumn eMail;
    public TableColumn address;
    public TableView table;
    public void receptioistViewDescriptionGoBackButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) paneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistHomeForm.fxml"))));
        stage.centerOnScreen();
    }

    public void receptioistViewDescriptionGoHomeButtonOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) paneID.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistHomeForm.fxml"))));
        stage.centerOnScreen();
    }
}
