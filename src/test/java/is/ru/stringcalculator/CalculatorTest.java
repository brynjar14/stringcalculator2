package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }
    private Calculator calculator = new Calculator();
    
    @Test
    public void EmptyString(){
    	assertEquals(calculator.add(""),0);
    }
    @Test 
    public void testOneNumber(){
    	assertEquals(calculator.add("4"),4);
    }
    @Test
    public void testTwoNumber(){
    	assertEquals(calculator.add("4,5"),9);
    }
    @Test
    public void twoNumbersNewline(){
    	assertEquals(calculator.add("4/n5"),9);
    }
  }