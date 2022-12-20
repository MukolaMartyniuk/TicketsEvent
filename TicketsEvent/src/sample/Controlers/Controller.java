package sample.Controlers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import sample.Initializations.Ticket;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Controller {

    @FXML
    private TextField tfCode_Ticket;

    @FXML
    private TextField tfClient;

    @FXML
    private TextField tfEvent;

    @FXML
    private TextField tfEmployee;

    @FXML
    private TextField tfData_of_Sale;

    @FXML
    private TextField tfTicket_Number;

    @FXML
    private TextField tfType_payment;

    @FXML
    private TextField tfCompany_name;

    @FXML
    private TextField tfReserved_Ticket;

    @FXML
    private Button btnInsert;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnDelete;

    @FXML
    private TableView<Ticket> tvTicket;

    @FXML
    private TableColumn<Ticket, Integer> colCode_Ticket;

    @FXML
    private TableColumn<Ticket, Integer> colClient;

    @FXML
    private TableColumn<Ticket, Integer> colEvent;

    @FXML
    private TableColumn<Ticket, Integer> colEmployee;

    @FXML
    private TableColumn<Ticket, Integer> colData_of_Sale;

    @FXML
    private TableColumn<Ticket, Integer> colTicket_number;

    @FXML
    private TableColumn<Ticket, Integer> colType_payment;

    @FXML
    private TableColumn<Ticket, String> colCompany_name;

    @FXML
    private TableColumn<Ticket, Integer> colReserved_Ticket;

    @FXML
    void handleButtonAction(ActionEvent event) {

    }

    static public Connection GetConnection() {
        String connectionUrl =
                "jdbc:sqlserver://localhost:1433;database=Kursova_2021;sendStringParametersAsUnicode=true";
        String name = "sa";
        String password = "Samsql@123";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(connectionUrl, name, password);
        }
        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void handleButtonAction(javafx.event.ActionEvent actionEvent) {
    }
}
