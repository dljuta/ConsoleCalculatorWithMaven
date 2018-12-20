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
		assertTrue(testee.Summe(12, 8) == 20);
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
		assertTrue(testee.multiplikation(8, 7) == 57);
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
}
