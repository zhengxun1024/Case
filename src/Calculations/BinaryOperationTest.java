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
		assertNotNull("�鿴�����Ƿ�Ϊ��", bop1);
	}

	@Test
	public void testEquals1() {
		assertEquals("�鿴���������Ƿ����", bop, bop1);
	}

	@Test
	public void testEquals3() {
		bop1 = bop;
		assertSame("�鿴��������������Ƿ����", bop, bop1);
	}

}
