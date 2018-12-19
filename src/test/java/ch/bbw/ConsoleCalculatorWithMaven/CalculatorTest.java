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
}
