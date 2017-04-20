/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Desktop;
import java.io.IOException;
import static java.lang.System.exit;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.Tooltip;
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
    @FXML
    private TextField dsg;
    @FXML
    private TextField crt;
    @FXML
    private TextField dcm;
    @FXML
    private Hyperlink link;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void GNU_link(ActionEvent event) {
        try {
           Process start = new ProcessBuilder("x-www-browser", "https://www.gnu.org/licenses/gpl-3.0.html").start();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }

    @FXML
    private void creditsAction(ActionEvent event) {
        if(creditsButton.isSelected() == true) {
            bg_pane_text.setVisible(true);
            dsg.setVisible(true);
            crt.setVisible(true);
            dcm.setVisible(true);
        }
        if(creditsButton.isSelected() == false) {
            bg_pane_text.setVisible(false);
            dsg.setVisible(false);
            crt.setVisible(false);
            dcm.setVisible(false);
        }
    }

    @FXML
    private void closeAction(ActionEvent event) {
        Stage close_stage = (Stage) closeAbout.getScene().getWindow();
        close_stage.close();
    }
    
}
