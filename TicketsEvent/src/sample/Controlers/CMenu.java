package sample.Controlers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class CMenu {

    @FXML
    private Button BtnTicket;

    @FXML
    private Button BtnEmployee;

    @FXML
    private Button BtnClient;

    @FXML
    private Button BtnEvent;

    @FXML
    private AnchorPane root;


    @FXML
    void initialize() {

        /*BtnTicket.setOnAction(actionEvent -> {
            AnchorPane pane = null;
            try {
                pane = FXMLLoader.load(getClass().getResource("sample.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            root.getChildren().setAll(pane);

        });*/

        BtnEmployee.setOnAction(actionEvent -> {
            AnchorPane pane = null;
            try {
                pane = FXMLLoader.load(getClass().getResource("Employee.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            root.getChildren().setAll(pane);

        });

        BtnClient.setOnAction(actionEvent -> {
            AnchorPane pane = null;
            try {
                pane = FXMLLoader.load(getClass().getResource("Client.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            root.getChildren().setAll(pane);

        });

        BtnEvent.setOnAction(actionEvent -> {
            AnchorPane pane = null;
            try {
                pane = FXMLLoader.load(getClass().getResource("Event.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            root.getChildren().setAll(pane);

        });

        BtnTicket.setOnMouseClicked(mouseEvent -> {
            AnchorPane pane = null;
            try {
                pane = FXMLLoader.load(getClass().getResource("sample.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            root.getChildren().setAll(pane);
        });

    }

}
