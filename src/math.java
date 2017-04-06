
import static java.lang.Math.sqrt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xblask04
 */
public class math {
    /**
     * @brief Function will add two numbers.
     * @param x first number for operation
     * @param y second number for operation
     * @return result of adding two parameters
     */
    public static double add(double x, double y){
        return x+y;
    }
    
    /**
     * @brief Substraction of two numbers
     * @param x first number for operation
     * @param y second number for operation
     * @return result of substracting two numbers
     */
    public static double sub(double x, double y){
        return x-y;
    }
    
    /**
     * @brief Function will multiply two numbers.
     * @param x first number for operation
     * @param y second number for operation
     * @return result of multiplying two numbers
     */
    public static double multiply(double x, double y){
        return x*y;
    }
    
    /**
     * @brief Division of two numbers
     * @param x divident
     * @param y divisor
     * @return result of deviding two numbers
     */
    public static double divide(double x, double y){
        return x/y;
    }
    
    /**
     * @brief Function will calculate a factorial of a given number.
     * @param num number from which we want factorial to be calculated from
     * @return value of the factorial
     */
    public static long factorial(long num){
        int check = 0;
        if(num < 0){
            check = 1;
            num = -num;
        }
        long sum = 1;
        for (long i = num; i > 0; i--){
            sum = sum*i;
        }
        if(check == 1){
            sum = -sum;
        }
        return sum;
    }
    
    /**
     *
     * @param x floating point base value
     * @param y power value
     * @return result of raising x to the power y
     */
    public static double pow(double x, int y){
        double sum = 1;
        for(int i = 0; i < y; i++){
            sum = sum*x;
        }
        return sum;
    }
    
    /**
     * @brief Modulo function
     * @param x divident
     * @param y divisor
     * @return the remainder from division
     */
    public static int mod(int x, int y){
        return x%y;
    }
    
    public static double new_sqrt(double x){
        return sqrt(x);
    }
}
