package Calculations;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinaryOperationTest {
	BinaryOperation bop;

	@Before
	public void setUp() throws Exception {
		bop = new BinaryOperation();
	}

	BinaryOperation bop1 = new BinaryOperation();

	@Test
	public void testNull() {
		assertNotNull("查看对象是否不为空", bop1);
	}

	@Test
	public void testEquals1() {
		assertEquals("查看两个对象是否相等", bop, bop1);
	}

	@Test
	public void testEquals3() {
		bop1 = bop;
		assertSame("查看两个对象的引用是否相等", bop, bop1);
	}

}
