package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }
    private Calculator calculator = new Calculator();
    
    @Test
    public void EmptyString() throws Exception{
    	assertEquals(calculator.add(""),0);
    }
    @Test 
    public void testOneNumber() throws Exception{
    	assertEquals(calculator.add("4"),4);
    }
    @Test
    public void testTwoNumber() throws Exception{
    	assertEquals(calculator.add("4,5"),9);
    }
    @Test
    public void twoNumbersNewline() throws Exception{
    	assertEquals(calculator.add("4/n5"),9);
    }
    @Test
    public void threeNumbersDelimited() throws Exception{
    	assertEquals(calculator.add("5,6,7"),18);
    }
    @Test(expected = Exception.class)
    public void negativeInputReturnsExeption() throws Exception{

    	calculator.add("-1");
    }
    @Test
    public void ignoreOver1000() throws Exception{
    	assertEquals(calculator.add("10,10,1001"),20);
    }
    }