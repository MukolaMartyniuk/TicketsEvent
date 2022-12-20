package sample.Controlers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class CClient {

    @FXML
    private TextField tfCode_Client;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfSurname;

    @FXML
    private TextField tfF_name;

    @FXML
    private TextField tfPhone;

    @FXML
    private Button btnInsert;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnDelete;

    @FXML
    private TableView<?> tvClient;

    @FXML
    private TableColumn<?, ?> colCode_Client;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colSurname;

    @FXML
    private TableColumn<?, ?> colF_name;

    @FXML
    private TableColumn<?, ?> colPhone;

    @FXML
    void handleButtonAction(ActionEvent event) {
    }

    public void handleButtonAction(javafx.event.ActionEvent actionEvent) {
    }
}
