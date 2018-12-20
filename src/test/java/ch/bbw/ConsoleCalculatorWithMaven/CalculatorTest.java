package ch.bbw.ConsoleCalculatorWithMaven;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ch.bbw.dl.ConsoleCalculatorWithMaven.Calculator;


public class CalculatorTest {
	
	Calculator testee;
	private Calculator test;
	
	//Summe
	
	@Test
	
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.Summe(12, 10) == 22);
	}
	
	@Test
	public void testSummeZweiNegativeIsOk() {
		test = new Calculator();
		assertTrue(test.Summe(-9, -6) == -14);
	}
	
	@Test
	public void testSummePositivUndNegativeIsOk() {
		test = new Calculator();
		assertTrue(test.Summe(34, -7) == 27);
	}

	@Test
	public void testSummeMaxValueUndMinValueIsOk() {
		test = new Calculator();
		assertTrue(test.Summe(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
	}
	
	@Test
	public void testSummeMaxValueUndZeroIsOk() {
		test = new Calculator();
		assertTrue(test.Summe(Integer.MAX_VALUE, 0) == 2073926091);
	}
	
	@Test
	public void testSummeMaxValueUndIsMinValueIsFalse1() {
		test = new Calculator();
		assertTrue(test.Summe(Integer.MAX_VALUE, 1) == Integer.MIN_VALUE);
	}
	
	@Test
	public void testSummeMaxValueIsFalse() {
		test = new Calculator();
		assertTrue(test.Summe(Integer.MAX_VALUE, Integer.MAX_VALUE) == -3);
	}
	
	@Test
	public void testSummeZeroIsOk() {
		test = new Calculator();
		assertTrue(test.Summe(-48, 48) == 0);
	}
	
	//Subtraction
	
	@Test
	public void testSubtraktionZweiPositiveIsOk() {
		assertTrue(testee.subtraction(25, 9) == 16);
	}
	
	@Test
	public void testSubtraktionZweiNegativeIsOk() {
		test = new Calculator();
		assertTrue(test.subtraction(-10, -11) == -21);
	}
	
	@Test
	public void testSubtraktionPositivUndNegativeIsOk() {
		test = new Calculator();
		assertTrue(test.subtraction(15, -6) == 21);
	}
	
	@Test
	public void testSubtraktionMaxValueUnd1IsMinValueIsFalse() {
		test = new Calculator();
		assertTrue(test.subtraction(Integer.MIN_VALUE, 1) == Integer.MAX_VALUE);
	}
	
	@Test
	public void testSubtraktionMinValueUndMaxValueIsFalse() {
		test = new Calculator();
		assertTrue(test.subtraction(Integer.MIN_VALUE, Integer.MAX_VALUE) == 1);
	}
	
	@Test
	public void testSubtraktionMaxValueUndZeroIsOk() {
		test = new Calculator();
		assertTrue(test.subtraction(Integer.MAX_VALUE, 0) == 2073926091);
	}
	
	@Test
	public void testSubtraktionMinValueUndZeroIsOk() {
		test = new Calculator();
		assertTrue(test.subtraction(Integer.MIN_VALUE, 0) == -2073926091);
	}
	
	@Test
	public void testSubtraktionZeroIsOk() {
		test = new Calculator();
		assertTrue(test.subtraction(18, 18) == 0);
	}
	
	//Multiplikation
	
	@Test
	public void testMultiplikationZweiPositiveIsOk() {
		assertTrue(testee.multiplikation(8, 7) == 56);
	}
	
	@Test
	public void testMultiplikationZweiNegativeIsOk() {
		test = new Calculator();
		assertTrue(test.multiplikation(-5, -7) == 35);
	}
	
	@Test
	public void testMultiplikationPositivUndNegativeIsOk() {
		test = new Calculator();
		assertTrue(test.multiplikation(-10, 5) == -50);
	}
	
	@Test
	public void testMultiplikationZeroIsOk() {
		test = new Calculator();
		assertTrue(test.multiplikation(80, 0) == 0);
	}
	
	@Test
	public void testMultiplikationZeroIsOk2() {
		test = new Calculator();
		assertTrue(test.multiplikation(0, 90) == 0);
	}
	
	@Test
	public void testMultiplikation0Und0IsOk() {
		test = new Calculator();
		assertTrue(test.multiplikation(0, 0) == 0);
	}
	
	//Division
	
	@Test
	public void testDivisionZweiPositiveIsOk() {
		assertTrue(testee.division(25, 5) == 5);
	}
	
	@Test
	public void testDivisionZweiNegativeIsOk() {
		test = new Calculator();
		assertTrue(test.division(-15, -3) == 5);
	}
	
	@Test
	public void testDivisionPositivUndNegativeIsOk() {
		test = new Calculator();
		assertTrue(test.division(12, -3) == -4);
	}
	
	@Test
	public void testDivisionNegativUndPositivIsOk() {
		test = new Calculator();
		assertTrue(test.division(-10, 5) == -2);
	}
	
	@Test
	public void testDivisionZweiGleicheZahlenIsOk() {
		test = new Calculator();
		assertTrue(test.division(19, 19) == 1);
	}
	
	@Test
	public void testDivisionDurch0IsFalse() throws ArithmeticException {
		test = new Calculator();
		assertTrue(test.division(13, 0) == 0);
	}
	
	@Test
	public void testDivision0DurchDividisorIsOk() {

		test = new Calculator();
		assertTrue(test.division(0, 12) == 0);
	}
	
	@Test
	public void testDivisionMaxValueUnd1IsOk() {
		test = new Calculator();
		assertTrue(test.division(Integer.MIN_VALUE, 1) == Integer.MIN_VALUE);
	}
}
