package Calculations;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExerciseTest {
	Exercise bop;

	@Before
	public void setUp() throws Exception {
		bop = new Exercise();
	}

	Exercise bop1 = new Exercise();

	@Test
	public void testNull() {
		assertNotNull("�鿴�����Ƿ�Ϊ��", bop1);
	}
	
	@Test
	public void testEquals() {
		assertEquals("�鿴���������Ƿ����", bop, bop1);
	}

}
