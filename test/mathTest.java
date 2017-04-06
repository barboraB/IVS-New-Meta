/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel
 */
public class mathTest {
    
    public mathTest() {
    }

   /**
     * Test of add method, of class math. 
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        assertEquals(2.0, math.add(1.0, 1.0), 0.00);       
        assertEquals(0, math.add(0, 0), 0.00);
        assertEquals(-5, math.add(-5, 0), 0.00);
        assertEquals(275, math.add(-5, 280), 0.00);
        assertEquals(-17, math.add(-9, -8), 0.00);
        assertEquals(9.6745, math.add(5.3895, 4.285), 0.00);
        assertEquals(0.0, math.add(0.0, 0.0), 0.00);
        assertEquals(-10130, math.add(-57987, 47857), 0.00);          
    }

    /**
     * Test of sub method, of class math.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        assertEquals(0.0, math.sub(1.0, 1.0), 0.00);       
        assertEquals(0.0, math.sub(0, 0), 0.00);
        assertEquals(-5.0, math.sub(-5, 0), 0.00);
        assertEquals(-285.0, math.sub(-5, 280), 0.00);
        assertEquals(-1.0, math.sub(-9, -8), 0.00);
        assertEquals(1.1045, math.sub(5.3895, 4.285), 0.00);
        assertEquals(3812130.0, math.sub(8557987, 4745857), 0.00);
    }

    /**
     * Test of multiply method, of class math.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        assertEquals(1.0, math.multiply(1.0, 1.0), 0.00);       
        assertEquals(0.0, math.multiply(0, 0), 0.00);
        assertEquals(0.0, math.multiply(-5, 0), 0.00);
        assertEquals(-1400.0, math.multiply(-5, 280), 0.00);
        assertEquals(72.0, math.multiply(-9, -8), 0.00);
        assertEquals(23.0940075, math.multiply(5.3895, 4.285), 0.00);
        assertEquals(46779859.0, math.multiply(7987, 5857), 0.00);
    }

    /**
     * Test of divide method, of class math.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        assertEquals(1.0, math.divide(1.0, 1.0), 0.00);       
        assertEquals(-0.017857142866, math.divide(-5, 280), 0.0000001);
        assertEquals(3.0, math.divide(-9, -3), 0.00);
        assertEquals(1.257759627, math.divide(5.3895, 4.285), 0.000001);
        assertEquals(13770.68966, math.divide(7987, 0.58), 0.001);
    }

    /**
     * Test of factorial method, of class math.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        assertEquals(1, math.factorial(1));       
        assertEquals(1, math.factorial(0));
        assertEquals(2, math.factorial(2));
        assertEquals(40320, math.factorial(8));
        assertEquals(-40320, math.factorial(-8));
        assertEquals(2-1, math.factorial(-1));
    }

    /**
     * Test of pow method, of class math.
     */
    @Test
    public void testPow() {
        System.out.println("pow");
        assertEquals(1.0, math.pow(1.0, 1), 0.00);       
        assertEquals(1, math.pow(-5, 0), 0.00);
        assertEquals(9765625, math.pow(-5, 10), 0.00);
        assertEquals(-1953125, math.pow(-5, 9), 0.00);
        assertEquals(843.7113763, math.pow(5.3895, 4), 0.000001); 
    }
  

    /**
     * Test of mod method, of class math.
     */
    @Test
    public void testMod() {
        System.out.println("mod");
        assertEquals(0, math.mod(1, 1), 0.00);       
        assertEquals(2, math.mod(37, 5), 0.00);
        assertEquals(9765625, math.mod(2, 5), 0.00);
    }
    
    @Test
    public void testSqrt() {
        System.out.println("sqrt");
        assertEquals(2, math.sqrt(4), 0.00);       
        assertEquals(0, math.sqrt(0), 0.00);
        assertEquals(2.23606797749979, math.sqrt(5), 0.000000001);
    }
    
}
