package sample.Controlers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class CEmployee {

    @FXML
    private TextField tfCode_Employee;

    @FXML
    private TextField tfPosition;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfSurname;

    @FXML
    private TextField tfF_Name;

    @FXML
    private TextField tfDate_Employee;

    @FXML
    private TextField tfAddress;

    @FXML
    private TextField tfPhone;

    @FXML
    private TextField tfStatus;

    @FXML
    private Button btnInsert;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnDelete;

    @FXML
    private TableView<?> tvEmployee;

    @FXML
    private TableColumn<?, ?> colCode_Employee;

    @FXML
    private TableColumn<?, ?> colPosition;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colSurname;

    @FXML
    private TableColumn<?, ?> colF_Name;

    @FXML
    private TableColumn<?, ?> colDate_Employee;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colPhone;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    void handleButtonAction(ActionEvent event) {

    }

    public void handleButtonAction(javafx.event.ActionEvent actionEvent) {
    }
}
