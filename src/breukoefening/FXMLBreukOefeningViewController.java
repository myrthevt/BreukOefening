/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breukoefening;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.shape.Line;

public class FXMLBreukOefeningViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField Teller;

    @FXML
    private Line Line;

    @FXML
    private TextField Noemer;

    @FXML
    private Button Button;

    @FXML
    void initialize() {
        assert Teller != null : "fx:id=\"Teller\" was not injected: check your FXML file 'FXMLBreukOefeningView.fxml'.";
        assert Line != null : "fx:id=\"Line\" was not injected: check your FXML file 'FXMLBreukOefeningView.fxml'.";
        assert Noemer != null : "fx:id=\"Noemer\" was not injected: check your FXML file 'FXMLBreukOefeningView.fxml'.";
        assert Button != null : "fx:id=\"Button\" was not injected: check your FXML file 'FXMLBreukOefeningView.fxml'.";

    }
}
