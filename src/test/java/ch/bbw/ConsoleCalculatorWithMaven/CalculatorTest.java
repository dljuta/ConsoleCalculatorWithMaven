package ch.bbw.ConsoleCalculatorWithMaven;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ch.bbw.dl.ConsoleCalculatorWithMaven.Calculator;


public class CalculatorTest {
	
	private Calculator test;
	
	//Summe
	
	@Before
	public void initialize() {
		test = new Calculator();
	}
	
	@After
	public void shutdown() {
		test = null;
	}
	
	@Test
	
	public void testSummeZweiPositiveIsOk() {
		
		assertTrue(test.Summe(12, 10) == 22);
	}
	
	@Test
	public void testSummeZweiNegativeIsOk() {
		
		assertTrue(test.Summe(-9, -6) == -15);
	}
	
	@Test
	public void testSummePositivUndNegativeIsOk() {
		
		assertTrue(test.Summe(34, -7) == 27);
	}

	@Test
	public void testSummeMaxValueUndMinValueIsOk() {
		
		assertTrue(test.Summe(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
	}
	
	@Test
	public void testSummeMaxValueUndZeroIsOk() {
		
		assertTrue(test.Summe(Integer.MAX_VALUE, 0) == 2073926091);
	}
	
	@Test
	public void testSummeMaxValueUndIsMinValueIsFalse1() {
		
		assertTrue(test.Summe(Integer.MAX_VALUE, 1) == Integer.MIN_VALUE);
	}
	
	@Test
	public void testSummeMaxValueIsFalse() {
		assertTrue(test.Summe(Integer.MAX_VALUE, Integer.MAX_VALUE) == -3);
	}
	
	@Test
	public void testSummeZeroIsOk() {
		
		assertTrue(test.Summe(-48, 48) == 0);
	}
	
	//Subtraction
	
	@Test
	public void testSubtraktionZweiPositiveIsOk() {
		assertTrue(test.subtraction(25, 9) == 16);
	}
	
	@Test
	public void testSubtraktionZweiNegativeIsOk() {
		
		assertTrue(test.subtraction(-10, -11) == -21);
	}
	
	@Test
	public void testSubtraktionPositivUndNegativeIsOk() {
		
		assertTrue(test.subtraction(15, -6) == 21);
	}
	
	@Test
	public void testSubtraktionMaxValueUnd1IsMinValueIsFalse() {
		
		assertTrue(test.subtraction(Integer.MIN_VALUE, 1) == Integer.MAX_VALUE);
	}
	
	@Test
	public void testSubtraktionMinValueUndMaxValueIsFalse() {
		
		assertTrue(test.subtraction(Integer.MIN_VALUE, Integer.MAX_VALUE) == 1);
	}
	
	@Test
	public void testSubtraktionMaxValueUndZeroIsOk() {
		
		assertTrue(test.subtraction(Integer.MAX_VALUE, 0) == 2073926091);
	}
	
	@Test
	public void testSubtraktionMinValueUndZeroIsOk() {
		
		assertTrue(test.subtraction(Integer.MIN_VALUE, 0) == -2073926091);
	}
	
	@Test
	public void testSubtraktionZeroIsOk() {
		
		assertTrue(test.subtraction(18, 18) == 0);
	}
	
	//Multiplikation
	
	@Test
	public void testMultiplikationZweiPositiveIsOk() {
		assertTrue(test.multiplikation(8, 7) == 56);
	}
	
	@Test
	public void testMultiplikationZweiNegativeIsOk() {
		
		assertTrue(test.multiplikation(-5, -7) == 35);
	}
	
	@Test
	public void testMultiplikationPositivUndNegativeIsOk() {
		
		assertTrue(test.multiplikation(-10, 5) == -50);
	}
	
	@Test
	public void testMultiplikationZeroIsOk() {
		
		assertTrue(test.multiplikation(80, 0) == 0);
	}
	
	@Test
	public void testMultiplikationZeroIsOk2() {
		
		assertTrue(test.multiplikation(0, 90) == 0);
	}
	
	@Test
	public void testMultiplikation0Und0IsOk() {
		
		assertTrue(test.multiplikation(0, 0) == 0);
	}
	
	//Division
	
	@Test
	public void testDivisionZweiPositiveIsOk() {
		assertTrue(test.division(25, 5) == 5);
	}
	
	@Test
	public void testDivisionZweiNegativeIsOk() {
		
		assertTrue(test.division(-15, -3) == 5);
	}
	
	@Test
	public void testDivisionPositivUndNegativeIsOk() {
		
		assertTrue(test.division(12, -3) == -4);
	}
	
	@Test
	public void testDivisionNegativUndPositivIsOk() {
		
		assertTrue(test.division(-10, 5) == -2);
	}
	
	@Test
	public void testDivisionZweiGleicheZahlenIsOk() {
		
		assertTrue(test.division(19, 19) == 1);
	}
	
	@Test
	public void testDivisionDurch0IsFalse() throws ArithmeticException {
		
		assertTrue(test.division(13, 0) == 0);
	}
	
	@Test
	public void testDivision0DurchDividisorIsOk() {

		
		assertTrue(test.division(0, 12) == 0);
	}
	
	@Test
	public void testDivisionMaxValueUnd1IsOk() {
		
		assertTrue(test.division(Integer.MIN_VALUE, 1) == Integer.MIN_VALUE);
	}
}
