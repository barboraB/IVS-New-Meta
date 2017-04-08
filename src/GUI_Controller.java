
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
 * @version 1.1
 */

/**
 * 
 * @todo Two dots in number
 *       Two operations in row
 *       Results of operations in between 2 operations
 */
public class GUI_Controller implements Initializable {
    
    private double operand_one;
    private double operand_two;
    private int operand_length;
    private int operation;
    private boolean new_operation;
    private boolean mid_operation;
    private boolean dot_flag;
    @FXML
    private TextField display;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.new_operation = false;
        this.mid_operation = false;
        this.dot_flag = false;
        this.operand_length = 0;
        this.operand_one = 0;
        this.operand_two = 0;
        this.operation = 0;
    }    

    @FXML
    private void zeroAction(ActionEvent event) {
        check_operation();
        display.setText(display.getText() + "0");
    }
    
    @FXML
    private void oneAction(ActionEvent event) {
        check_operation();
        display.setText(display.getText() + "1");
    }
    
    @FXML
    private void twoAction(ActionEvent event) {
        check_operation();
        display.setText(display.getText() + "2");
    }
 
    @FXML
    private void threeAction(ActionEvent event) {
        check_operation();
        display.setText(display.getText() + "3");
    }

    @FXML
    private void fourAction(ActionEvent event) {
        check_operation();
        display.setText(display.getText() + "4");
    }

    @FXML
    private void fiveAction(ActionEvent event) {
        check_operation();
        display.setText(display.getText() + "5");
    }

    @FXML
    private void sixAction(ActionEvent event) {
        check_operation();
        display.setText(display.getText() + "6");
    }
    
    @FXML
    private void sevenAction(ActionEvent event) {
        check_operation();
        display.setText(display.getText() + "7");
    }

    @FXML
    private void eigthAction(ActionEvent event) {
        check_operation();
        display.setText(display.getText() + "8");
    }

    @FXML
    private void nineAction(ActionEvent event) {
        check_operation();
        display.setText(display.getText() + "9");
    }

    @FXML
    private void powAction(ActionEvent event) {
        if (display.getText().length() > 0) {
            if(mid_operation == true) {
                mid_result();
            }      
            mid_operation = true;
            dot_flag = false;
            operand_one = Float.parseFloat(display.getText());
            operand_length = display.getText().length();
            operation = 5; // POW
            new_operation = false;
            display.setText(display.getText() + "^");
        }
    }

    @FXML
    private void DELAction(ActionEvent event) {
        String str = null;
        if (display.getText() != null && display.getText().length() > 0) {
            if(operation > 0 && ((operand_length + 1) == display.getText().length())){
                operation = 0;
                mid_operation=false;
            }
            if(operation != 0) {
                str = display.getText().substring(0,display.getText().length()-1);
                String str_sec = display.getText().substring(operand_length + 1,display.getText().length()-1);
                if (str_sec.contains(".") == false) {
                    dot_flag = false;
                }
            }else {
                str = display.getText().substring(0,display.getText().length()-1);
                if (str.contains(".") == false) {
                    dot_flag = false;
                }
            }
        display.setText(str);
        }
    }

    @FXML
    private void CAction(ActionEvent event) {
        display.setText("");
        operand_one = 0;
        operand_two = 0;
        dot_flag = false;
        new_operation = false;
        mid_operation = false;
    }

    @FXML
    private void equalAction(ActionEvent event) {
        mid_result();
    }
    
    @FXML
    private void dotAction(ActionEvent event) {
        if(display.getText().length() > 0) {
            if(dot_flag == false) {
                display.setText(display.getText() + "."); 
                dot_flag = true;
            }//else if(){
                
            //}
        }
    }

    @FXML
    private void plusAction(ActionEvent event) {
        if(display.getText().length() > 0) {
            if(mid_operation == true) {
                mid_result();
            }
            mid_operation = true;
            dot_flag = false;
            operand_one = Float.parseFloat(display.getText()); 
            operand_length = display.getText().length();
            operation = 1; // ADD 
            new_operation = false;
            display.setText(display.getText() + "+");
        }
    }

    @FXML
    private void minusAction(ActionEvent event) {
        if(display.getText().length() > 0) {
            if(mid_operation == true) {
                mid_result();
            }
            mid_operation = true;
            dot_flag = false;
            operand_one = Float.parseFloat(display.getText());
            operand_length = display.getText().length();
            operation = 3; // SUBSTRACT
            new_operation = false;
            display.setText(display.getText() + "-");
        }
    }

    @FXML
    private void moduloAction(ActionEvent event) {
        if (display.getText().length() > 0) {
            if(mid_operation == true) {
                mid_result();
            }
            mid_operation = true;
            dot_flag = false;
            operand_one = Float.parseFloat(display.getText());
            operand_length = display.getText().length();
            operation = 6; // MODULO
            new_operation = false;
            display.setText(display.getText() + "%");
        }
    }

    @FXML
    private void sqrtAction(ActionEvent event) {
        if (display.getText().length() > 0) {
            if(mid_operation == true) {
                mid_result();
            }   
            mid_operation = true;
            dot_flag = false;
            operand_one = Float.parseFloat(display.getText());
            operation = 7;
            new_operation = false;
            display.setText("√" + display.getText());
        }
    }

    @FXML
    private void multiAction(ActionEvent event) {
        if (display.getText().length() > 0) {
            if(mid_operation == true) {
                mid_result();
            } 
            mid_operation = true;
            dot_flag = false;
            operand_one = Float.parseFloat(display.getText());
            operand_length = display.getText().length();
            operation = 2; // MULTIPLY
            new_operation = false;
            display.setText(display.getText() + "*");
        }
    }

    @FXML
    private void divAction(ActionEvent event) {
        if (display.getText().length() > 0) {
            if(mid_operation == true) {
                mid_result();
            }
            mid_operation = true;
            dot_flag = false;
            operand_one = Float.parseFloat(display.getText());
            operand_length = display.getText().length();
            operation = 4; // DIVIDE
            new_operation = false;
            display.setText(display.getText() + "/");
        }
    }


    @FXML
    private void factAction(ActionEvent event) {
        if (display.getText().length() > 0) {
            if(mid_operation == true) {
                mid_result();
            } 
            mid_operation = true;
            dot_flag = false;
            operand_one = Float.parseFloat(display.getText());
            operation = 8;
            new_operation = false;
            display.setText(display.getText() + "!");
        }
    }
    
    private void check_operation() {
        if(new_operation == true) {
            display.setText("");
            operand_one = 0;
            operand_two = 0;
            operation = 0;
            new_operation = false;
        }
    }

    private long is_int(double x) {
        if(x % 1 == 0){
            return (long)x;
        }else {
            return -1;
        }
    }
    private void mid_result() {
        check_operation();
        new_operation = true;
        dot_flag = true;
        mid_operation = false;
        if((operation <= 6) && (operation > 0)) {
            String str = display.getText().substring(operand_length + 1);
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
    }
    //private void change_operation() {
      //  switch(operation) {
        //    case 1:  display.getText().substring(0,display.getText().length()-1);
                    
        //}
    //}
}
    