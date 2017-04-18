/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author jakub
 */
public class CreditsController implements Initializable {

    @FXML
    private Button closeAbout;
    @FXML
    private ToggleButton creditsButton;
    @FXML
    private Pane bg_pane;
    @FXML
    private TextArea bg_pane_text;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.bg_pane_text.setText("");
        this.bg_pane_text.appendText("Created by: \n");
        this.bg_pane_text.appendText("Barbora Blašková \n");
        this.bg_pane_text.appendText("Jakub Crkoň \n");
        this.bg_pane_text.appendText("Gabriel Koštialik \n");
        this.bg_pane_text.appendText("Documented by: \n");
        this.bg_pane_text.appendText("Barbora Blašková \n");
        this.bg_pane_text.appendText("Gabriel Koštialik \n");
        this.bg_pane_text.appendText("Designed by: \n");
        this.bg_pane_text.appendText("Barbora Blašková \n");
        this.bg_pane_text.appendText("Jakub Crkoň \n");
    }    

    @FXML
    private void GNU_link(ActionEvent event){
    }

    @FXML
    private void creditsAction(ActionEvent event) {
        if(creditsButton.isSelected() == true) {
            bg_pane_text.setVisible(true);
        }
        if(creditsButton.isSelected() == false) {
            bg_pane_text.setVisible(false);
        }
    }

    @FXML
    private void closeAction(ActionEvent event) {
        Stage close_stage = (Stage) closeAbout.getScene().getWindow();
        close_stage.close();
    }
    
}
