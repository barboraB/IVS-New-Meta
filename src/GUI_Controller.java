/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jakub
 */
public class GUI_Controller implements Initializable {
    
    String str;
    double operand_one = 0;
    double operand_two = 0;
    int operand_length = 0;
    int operation = 0;
    boolean new_operation = false;
    @FXML
    private TextField display;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button pow;
    @FXML
    private Button DEL;
    @FXML
    private Button C;
    @FXML
    private Button equal;
    @FXML
    private Button zero;
    @FXML
    private Button four;
    @FXML
    private Button one;
    @FXML
    private Button five;
    @FXML
    private Button two;
    @FXML
    private Button six;
    @FXML
    private Button three;
    @FXML
    private Button dot;
    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private Button modulo;
    @FXML
    private Button sqrt;
    @FXML
    private Button multi;
    @FXML
    private Button div;
    @FXML
    private Button fact;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(new_operation == true ) {
            new_operation = false;
            display.setText("");
        }
        if(event.getSource() == zero ) {
                display.setText(display.getText() + "0");
        }
            else if(event.getSource() == one ) {
                display.setText(display.getText() + "1");
        }
            else if(event.getSource() == two ) {
                display.setText(display.getText() + "2");
        }
            else if(event.getSource() == three ) {
                display.setText(display.getText() + "3");
        }
            else if(event.getSource() == four ) {
                display.setText(display.getText() + "4");
        }
            else if(event.getSource() == five ) {
                display.setText(display.getText() + "5");
        }
            else if(event.getSource() == six ) {
                display.setText(display.getText() + "6");
        }
            else if(event.getSource() == seven ) {
                display.setText(display.getText() + "7");
        }
            else if(event.getSource() == eight ) {
                display.setText(display.getText() + "8");
        }
            else if(event.getSource() == nine ) {
                display.setText(display.getText() + "9");
        }   else if(event.getSource() == dot ) {
                if(display.getText().length() > 0) {
                display.setText(display.getText() + ".");   // to do - two dots in number ??? !!!
                }
        }   else if(event.getSource() == C ) {
                display.setText("");
                str = "";
                operand_one = 0;
                operand_two = 0;
        }   else if(event.getSource() == DEL ) {
                if (display.getText() != null && display.getText().length() > 0) {
                    str = display.getText().substring(0,display.getText().length()-1);
                    display.setText(str);
                }
                str = "";
        }   else if(event.getSource() == plus ) {
                if (display.getText().length() > 0) {
                    operand_one = Float.parseFloat(display.getText());
                    operand_length = display.getText().length();
                    operation = 1; // ADD 
                    display.setText(display.getText() + "+");
                }
        
        }   else if(event.getSource() == multi ) {
                if (display.getText().length() > 0) {
                    operand_one = Float.parseFloat(display.getText());
                    operand_length = display.getText().length();
                    operation = 2; // MULTIPLY
                    display.setText(display.getText() + "*");
                }
        
        }   else if(event.getSource() == minus ) {
                if (display.getText().length() > 0) {
                    operand_one = Float.parseFloat(display.getText());
                    operand_length = display.getText().length();
                    operation = 3; // SUBSTRACT
                    display.setText(display.getText() + "-");
                }
        
        }   else if(event.getSource() == div ) {
                if (display.getText().length() > 0) {
                    operand_one = Float.parseFloat(display.getText());
                    operand_length = display.getText().length();
                    operation = 4; // DIVIDE
                    display.setText(display.getText() + "/");
                }
        
        }   else if(event.getSource() == pow ) {
                if (display.getText().length() > 0) {
                    operand_one = Float.parseFloat(display.getText());
                    operand_length = display.getText().length();
                    operation = 5; // POW
                    display.setText(display.getText() + "^");
                }
        
        }   else if(event.getSource() == sqrt ) {
                if (display.getText().length() > 0) {
                    operand_one = Float.parseFloat(display.getText());
                    display.setText(display.getText() + "√");
                }
        
        }   else if(event.getSource() == modulo ) {
                if (display.getText().length() > 0) {
                    operand_one = Float.parseFloat(display.getText());
                    operand_length = display.getText().length();
                    operation = 6; // MODULO
                    display.setText(display.getText() + "%");
                }
        }   else if(event.getSource() == fact ) {
                if (display.getText().length() > 0) {
                    operand_one = Float.parseFloat(display.getText());
                    display.setText("factorial funkcia");
                }
                operand_one = 0;
        }   else if(event.getSource() == equal ) {
                new_operation = true;
                str = display.getText().substring(operand_length + 1);
                operand_two = (Float.parseFloat(str));
                switch(operation) {
                    case 1: display.setText(String.valueOf(math.add(operand_one, operand_two)));
                            break;
                    case 2: display.setText(String.valueOf(math.multiply(operand_one, operand_two)));
                            break;
                    case 3: display.setText(String.valueOf(math.sub(operand_one, operand_two)));
                            break;
                    case 4: display.setText(String.valueOf(math.divide(operand_one, operand_two)));
                            break;
                    //case 5: display.setText(String.valueOf(math.pow(operand_one, operand_two)));
                    //case 6: display.setText(String.valueOf(math.mod(operand_one, operand_two)));  
                }
                
            }
    }
}