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
		assertNotNull("查看对象是否不为空", bop1);
	}
	
	@Test
	public void testEquals() {
		assertEquals("查看两个对象是否相等", bop, bop1);
	}

}
