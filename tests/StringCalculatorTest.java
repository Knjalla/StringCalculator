import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void emptyArray() {
		StringCalculator strCalc = new StringCalculator();
		
		assertEquals(0, strCalc.add(""));
	}
	
	@Test
	public void sumIsCorrectTest() {
		StringCalculator strCalc = new StringCalculator();
		
		String str = "1,2,3";
		
		assertEquals(6, strCalc.add(str));
	}
	
	@Test
	public void sumIsCorrectTest2() {
		StringCalculator strCalc = new StringCalculator();
		
		String str = "10,200,3000";
		
		assertEquals(3210, strCalc.add(str));
	}
	
	@Test
	public void sumWithNegativeNumberTest() {
		StringCalculator strCalc = new StringCalculator();
		
		String str = "1,-2,3";
		
		assertEquals(0, strCalc.add(str));
	}
	
	@Test
	public void sumWithNonNumberTest() {
		StringCalculator strCalc = new StringCalculator();
		
		String str = "1,two,3";
		
		assertEquals(0, strCalc.add(str));
	}
	
	@Test (expected = StringCalculatorException.class)
	public void inputValidatorTestEndsWithIllegalChar() throws StringCalculatorException{
		StringCalculator strCalc = new StringCalculator();
		
		String str = "1,2,";
				
		assertEquals(true, strCalc.inputValidityChecker(str));
	}
	
	@Test (expected = StringCalculatorException.class)
	public void inputValidatorTestWithNegativeNumbers() throws StringCalculatorException{
		StringCalculator strCalc = new StringCalculator();
		
		String str = "1,2,-3";
				
		assertEquals(true, strCalc.inputValidityChecker(str));
	}
	
	@Test (expected = StringCalculatorException.class)
	public void sliceStringTestWithMoreThan3Numbers() throws StringCalculatorException{
		StringCalculator strCalc = new StringCalculator();
		
		String str = "1,2,3,4";
		int[] eResult = new int[] {1,2,3,4};
				
		assertEquals(eResult, strCalc.sliceString(str));
	}
	
	@Test (expected = StringCalculatorException.class)
	public void inputValidatorTestWithNonNumbers() throws StringCalculatorException{
		StringCalculator strCalc = new StringCalculator();
		
		String str = "one,two,three";
				
		assertEquals(true, strCalc.inputValidityChecker(str));
	}
	
	@Test
	public void sliceStringTest() throws StringCalculatorException{
		StringCalculator strCalc = new StringCalculator();
		
		String str = "1,2,3";
		int[] compareStr = {1,2,3};
		
		assertEquals(compareStr, strCalc.sliceString(str));
	}

}
