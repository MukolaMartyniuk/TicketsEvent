package sample.Controlers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class CEvent {

    @FXML
    private TextField tfCode_Event;

    @FXML
    private TextField tfName_Event;

    @FXML
    private TextField tfData_Event;

    @FXML
    private TextField tfPrice;

    @FXML
    private TextField tfNumber_of_seets;

    @FXML
    private TextField tfType_Event;

    @FXML
    private TextField tfAvailability;

    @FXML
    private Button btnInsert;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnDelete;

    @FXML
    private TableView<?> tvEvent;

    @FXML
    private TableColumn<?, ?> colCode_Event;

    @FXML
    private TableColumn<?, ?> colName_Event;

    @FXML
    private TableColumn<?, ?> colData_Event;

    @FXML
    private TableColumn<?, ?> colPrice;

    @FXML
    private TableColumn<?, ?> colNumber_of_seets;

    @FXML
    private TableColumn<?, ?> colType_Event;

    @FXML
    private TableColumn<?, ?> colAvailability;

    @FXML
    void handleButtonAction(ActionEvent event) {

    }

    public void handleButtonAction(javafx.event.ActionEvent actionEvent) {
    }
}

