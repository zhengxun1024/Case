package Calculations;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinaryOperationTest {
	BinaryOperation bop, bop1;

	@Before
	public void setUp() throws Exception {
		bop = new AdditionOperation();
		bop1 = new SubstractOperation();
	}

	@Test
	public void testAdditionNull() {
		assertNull("加法对象是不是为空", bop);

	}

	@Test
	public void testSubstractNull() {
		assertNull("减法对象是不是为空", bop1);
	}

	@Test
	public void testCheckCalculation() {
		assertTrue("检查加法计算结果",bop.checkCalculation(100));
	}

	@Test
	public void testCheckCalculation1() {
		assertTrue("检查减法计算结果",bop1.checkCalculation(0));
	}
	
	@Test
	public void testAdditionCalculate() {
		assertEquals("加法计算方法是否正确", bop.calculate(54, 13), 67);
	}
	
	@Test
	public void testSubstractCalculate() {
		assertEquals("减法计算方法是否正确", bop1.calculate(54, 13), 41);
	}
	
	@Test
	public void testEquals() {
		assertEquals("两个对象是否相等", bop, bop1);
	}

}
