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
		assertNull("�ӷ������ǲ���Ϊ��", bop);

	}

	@Test
	public void testSubstractNull() {
		assertNull("���������ǲ���Ϊ��", bop1);
	}

	@Test
	public void testCheckCalculation() {
		assertTrue("���ӷ�������",bop.checkCalculation(100));
	}

	@Test
	public void testCheckCalculation1() {
		assertTrue("������������",bop1.checkCalculation(0));
	}
	
	@Test
	public void testAdditionCalculate() {
		assertEquals("�ӷ����㷽���Ƿ���ȷ", bop.calculate(54, 13), 67);
	}
	
	@Test
	public void testSubstractCalculate() {
		assertEquals("�������㷽���Ƿ���ȷ", bop1.calculate(54, 13), 41);
	}
	
	@Test
	public void testEquals() {
		assertEquals("���������Ƿ����", bop, bop1);
	}

}
