/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 * FXML Controller class
 *
 * @author jakub
 */
public class GUI_Controller implements Initializable {

    @FXML
    private TextField display;
    @FXML
    private TextField OP_display;
    private double operand_one;
    private double operand_two;
    private boolean dot_flag;
    private boolean reset_D;
    private int operation;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.operand_one = 0;
        this.operand_two = 0;
        this.dot_flag = false;
        this.reset_D = false;
        this.operation = 0;
    }    
    @FXML
    private void zeroAction(ActionEvent event) {
        if(reset_D == true) {
           display.setText("");
           reset_D = false;
            
        }
        display.setText(display.getText() + "0");
    }
    
    @FXML
    private void oneAction(ActionEvent event) {
        if(reset_D == true) {
           display.setText("");
           reset_D = false;
            
        }
        display.setText(display.getText() + "1");
    }
    
    @FXML
    private void twoAction(ActionEvent event) {
        if(reset_D == true) {
           display.setText("");
           reset_D = false;
            
        }       
        display.setText(display.getText() + "2");
    }
 
    @FXML
    private void threeAction(ActionEvent event) {
        if(reset_D == true) {
           display.setText("");
           reset_D = false;
            
        }        
        display.setText(display.getText() + "3");
    }

    @FXML
    private void fourAction(ActionEvent event) {
        if(reset_D == true) {
           display.setText("");
           reset_D = false;
            
        }        
        display.setText(display.getText() + "4");
    }

    @FXML
    private void fiveAction(ActionEvent event) {
        if(reset_D == true) {
           display.setText("");
           reset_D = false;
            
        }        
        display.setText(display.getText() + "5");
    }

    @FXML
    private void sixAction(ActionEvent event) {
        if(reset_D == true) {
           display.setText("");
           reset_D = false;
            
        }        
        display.setText(display.getText() + "6");
    }
    
    @FXML
    private void sevenAction(ActionEvent event) {
        if(reset_D == true) {
           display.setText("");
           reset_D = false;
            
        }        
        display.setText(display.getText() + "7");
    }

    @FXML
    private void eigthAction(ActionEvent event) {
        if(reset_D == true) {
           display.setText("");
           reset_D = false;
            
        }        
        display.setText(display.getText() + "8");
    }

    @FXML
    private void nineAction(ActionEvent event) {
        if(reset_D == true) {
           display.setText("");
           reset_D = false;
            
        }        
        display.setText(display.getText() + "9");
    }

    @FXML
    private void DELAction(ActionEvent event) {
        String str = "";
        if(display.getText().length() == 1 && operation != 0) {
            reset();
        }
        if (display.getText() != null && display.getText().length() > 0) {
            str = display.getText().substring(0,display.getText().length()-1);
            if (str.contains(".") == false) {
                dot_flag = false;
            }
        }
        display.setText(str);
    }

    @FXML
    private void CAction(ActionEvent event) {
        reset();
    }

    @FXML
    private void equalAction(ActionEvent event) {
        mid_result();
    }
    
    @FXML
    private void dotAction(ActionEvent event) {
        if(display.getText().length() > 0 && dot_flag == false && (! display.getText().equals("-"))) {
                display.setText(display.getText() + "."); 
                dot_flag = true;
            }
    }

    @FXML
    private void plusAction(ActionEvent event) {
        if(display.getText().length() > 0 && (! display.getText().equals("-"))) {
            if(operation != 0) {
                mid_result();
            }
            dot_flag = false;
            reset_D = true;
            operand_one = Float.parseFloat(display.getText()); 
            operation = 1; // ADD 
            OP_display.setText("+");
        }
    }

    @FXML
    private void minusAction(ActionEvent event) {
        if(display.getText().length() == 0 ||  operation != 0 ) {
            display.setText("-");
            reset_D = false;
        }
        else if(display.getText().equals("-")) {
            reset();
        }
        else {
            if(operation != 0) {
                mid_result();
            }            
            dot_flag = false;
            reset_D = true;
            operand_one = Float.parseFloat(display.getText()); 
            operation = 3; // SUBSTRACT 
            OP_display.setText("-");
        }
    }

    @FXML
    private void moduloAction(ActionEvent event) {
        if(display.getText().length() > 0 && (! display.getText().equals("-"))) {
            if(operation != 0) {
                mid_result();
            }            
            dot_flag = false;
            reset_D = true;
            operand_one = Float.parseFloat(display.getText()); 
            operation = 6; // MODULO
            OP_display.setText("%");
        }
    }

    @FXML
    private void sqrtAction(ActionEvent event) {
        if(display.getText().length() > 0 && (! display.getText().equals("-"))) {          
            dot_flag = false;
            reset_D = true;
            operand_one = Float.parseFloat(display.getText()); 
            operation = 7;
            mid_result();
        } 
        
    }
    
    @FXML
    private void powAction(ActionEvent event) {
        if(display.getText().length() > 0 && (! display.getText().equals("-"))) {
            if(operation != 0) {
                mid_result();
            }            
            dot_flag = false;
            reset_D = true;
            operand_one = Float.parseFloat(display.getText()); 
            operation = 5; // POW
            OP_display.setText("^");
        }        
    }

    @FXML
    private void multiAction(ActionEvent event) {
        if(display.getText().length() > 0 && (! display.getText().equals("-"))) {
            if(operation != 0) {
                mid_result();
            }           
            dot_flag = false;
            reset_D = true;
            operand_one = Float.parseFloat(display.getText()); 
            operation = 2; // MULTIPLY
            OP_display.setText("*");
        }          
    }

    @FXML
    private void divAction(ActionEvent event) {
        if(display.getText().length() > 0 && (! display.getText().equals("-"))) {
            if(operation != 0) {
                mid_result();
            }           
            dot_flag = false;
            reset_D = true;
            operand_one = Float.parseFloat(display.getText()); 
            operation = 4; // DIVIDE
            OP_display.setText("/");
        } 
    }

    @FXML
    private void factAction(ActionEvent event) {
        if(display.getText().length() > 0) {        
            dot_flag = false;
            reset_D = true;
            operand_one = Float.parseFloat(display.getText()); 
            operation = 8;
            mid_result();
        } 
    }
    @FXML
    private void helpAction(ActionEvent event) {
        try {
            FXMLLoader helpLoader = new FXMLLoader(getClass().getResource("Help.fxml"));
            Parent root1 = (Parent) helpLoader.load();
            Stage help;
            help = new Stage();
            help.initStyle(StageStyle.UNDECORATED);
            help.setScene(new Scene(root1));  
            help.show();
        } catch(Exception e) {
           e.printStackTrace();
          }
    }
    private void mid_result() {
        if((operation <= 6) && (operation > 0)) {
            operand_two = Float.parseFloat(display.getText());
            //operand_two = is_negative(operand_two);
            switch(operation) {
                case 1: display.setText(String.valueOf(math.add(operand_one, operand_two)));
                        break;
                case 2: display.setText(String.valueOf(math.multiply(operand_one, operand_two)));
                        break;
                case 3: display.setText(String.valueOf(math.sub(operand_one, operand_two)));
                        break;
                case 4: display.setText(String.valueOf(math.divide(operand_one, operand_two)));
                        break;
                case 5: operand_two = is_int(operand_two);
                        if(operand_two >= 0){
                            display.setText(String.valueOf(math.pow(operand_one, (int)operand_two)));
                        }else {
                            display.setText("Err");
                        }
                        break;
                        
                case 6: operand_one = is_int(operand_one);
                        operand_two = is_int(operand_two);
                        if(operand_one >= 0 && operand_two >= 0){
                        display.setText(String.valueOf(math.mod((int)operand_one, (int)operand_two))); 
                        }else{
                            display.setText("Err");
                        }
                        break;
            }
        }
        if(operation > 4) {
            switch(operation) {
                case 7: display.setText(String.valueOf(math.new_sqrt(operand_one)));
                        break;
                case 8: operand_one = is_int(operand_one);
                        if(operand_one >= 0){
                        display.setText(String.valueOf(math.factorial((long)operand_one)));
                        }else{
                            display.setText("Err");
                        }
                        break;
            }  
        }
        dot_flag = false;
        if(display.getText().contains(".") == true) {
            dot_flag = true;
        }
        reset_D = false;
        OP_display.setText("=");
        operation = 0;
    }
    
    private long is_int(double x) {
        if(x % 1 == 0){
            return (long)x;
        }else {
            return -1;
        }
    }
    
    private void reset() {
        display.setText("");
        OP_display.setText("");
        operand_one = 0;
        operand_two = 0;
        operation = 0;
        dot_flag = false;
        reset_D = false;
    }
}
