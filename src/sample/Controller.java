package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtSeshenieToDiametr;

    @FXML
    private Label PrintDiametr;

    @FXML
    private TextArea InputSechenie;

    @FXML
    private TextArea InputDiametr;

    @FXML
    private Button BtDiametrToSechenie;

    @FXML
    private Label PrintSechenie;

    @FXML
    void initialize() {
        assert BtSeshenieToDiametr != null : "fx:id=\"BtSeshenieToDiametr\" was not injected: check your FXML file 'sample.fxml'.";
        assert PrintDiametr != null : "fx:id=\"PrintDiametr\" was not injected: check your FXML file 'sample.fxml'.";
        assert InputSechenie != null : "fx:id=\"InputSechenie\" was not injected: check your FXML file 'sample.fxml'.";
        assert InputDiametr != null : "fx:id=\"InputDiametr\" was not injected: check your FXML file 'sample.fxml'.";
        assert BtDiametrToSechenie != null : "fx:id=\"BtDiametrToSechenie\" was not injected: check your FXML file 'sample.fxml'.";
        assert PrintSechenie != null : "fx:id=\"PrintSechenie\" was not injected: check your FXML file 'sample.fxml'.";

    }
}
