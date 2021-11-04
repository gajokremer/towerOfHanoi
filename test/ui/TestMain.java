package ui;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMain {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	private Main main;
	
	public void setUpScenario1() {
		
		main = new Main();
	}
	
	public void setUpScenario2() {
		
		main = new Main();
		main.createPoles(6);
	}
	
	@Test
	public void testCreatePoles() {
		
		setUpScenario1();
		
		main.createPoles(4);
		
		int[] poles = main.getPoles();
		
		assertEquals(poles[0], 4);
	}
	
	@Test
	public void testSolve() {
		
		setUpScenario2();

		int[] poles = main.getPoles();
		int n = poles[0];
		
		main.solve(n, poles[0], poles[1], poles[2], 0, 1, 2);
		
//		assertEquals(poles[0], 0);
		assertEquals(6, poles[2]);
	}
	
	@Test
	public void testMultipleSolve() {
		
		setUpScenario1();
		
		main.createPoles(0);
		int[] poles = main.getPoles();
		
//		for(int i = 0; i < 30; i++) {
//			
//			poles[0] = i;
//			assertEquals(poles[0], i);
//			assertEquals(poles[2], 0);
//			main.solve(i, poles[0], poles[1], poles[2], 0, 1, 2);
//		}

		poles[0] = 1;
		poles[1] = 0;
		poles[2] = 0;
		main.solve(1, poles[0], poles[1], poles[2], 0, 1, 2);
		assertNotEquals(1, poles[0]);
		
		poles[0] = 2;
		poles[1] = 0;
		poles[2] = 0;
		main.solve(2, poles[0], poles[2], poles[2], 0, 1, 2);
		assertNotEquals(2, poles[0]);
		
		poles[0] = 3;
		poles[1] = 0;
		poles[2] = 0;
		main.solve(3, poles[0], poles[1], poles[2], 0, 1, 2);
		assertNotEquals(1, poles[0]);
		
		poles[0] = 4;
		poles[1] = 0;
		poles[2] = 0;
		main.solve(4, poles[0], poles[1], poles[2], 0, 1, 2);
		assertNotEquals(1, poles[0]);
		
		poles[0] = 5;
		poles[1] = 0;
		poles[2] = 0;
		main.solve(5, poles[0], poles[1], poles[2], 0, 1, 2);
		assertNotEquals(1, poles[0]);
		
		poles[0] = 6;
		poles[1] = 0;
		poles[2] = 0;
		main.solve(6, poles[0], poles[1], poles[2], 0, 1, 2);
		assertNotEquals(1, poles[0]);
		
		poles[0] = 7;
		poles[1] = 0;
		poles[2] = 0;
		main.solve(7, poles[0], poles[1], poles[2], 0, 1, 2);
		assertNotEquals(1, poles[0]);
		
		poles[0] = 8;
		poles[1] = 0;
		poles[2] = 0;
		main.solve(8, poles[0], poles[1], poles[2], 0, 1, 2);
		assertNotEquals(1, poles[0]);
		
		poles[0] = 9;
		poles[1] = 0;
		poles[2] = 0;
		main.solve(9, poles[0], poles[1], poles[2], 0, 1, 2);
		assertNotEquals(1, poles[0]);
		
		poles[0] = 10;
		poles[1] = 0;
		poles[2] = 0;
		main.solve(10, poles[0], poles[1], poles[2], 0, 1, 2);
		assertNotEquals(1, poles[0]);
		
		poles[0] = 11;
		poles[1] = 0;
		poles[2] = 0;
		main.solve(11, poles[0], poles[1], poles[2], 0, 1, 2);
		assertNotEquals(1, poles[0]);
	
		poles[0] = 12;
		poles[1] = 0;
		poles[2] = 0;
		main.solve(12, poles[0], poles[1], poles[2], 0, 1, 2);
		assertNotEquals(1, poles[0]);
		
		poles[0] = 13;
		poles[1] = 0;
		poles[2] = 0;
		main.solve(13, poles[0], poles[1], poles[2], 0, 1, 2);
		assertNotEquals(1, poles[0]);
		
		poles[0] = 14;
		poles[1] = 0;
		poles[2] = 0;
		main.solve(14, poles[0], poles[1], poles[2], 0, 1, 2);
		assertNotEquals(1, poles[0]);
		
		poles[0] = 15;
		poles[1] = 0;
		poles[2] = 0;
		main.solve(15, poles[0], poles[1], poles[2], 0, 1, 2);
		assertNotEquals(1, poles[0]);
		
//		poles[0] = 16;
//		poles[1] = 0;
//		poles[2] = 0;
//		main.solve(16, poles[0], poles[1], poles[2], 0, 1, 2);
//		assertNotEquals(1, poles[0]);
//		
//		poles[0] = 17;
//		poles[1] = 0;
//		poles[2] = 0;
//		main.solve(17, poles[0], poles[1], poles[2], 0, 1, 2);
//		assertNotEquals(1, poles[0]);
//		
//		poles[0] = 18;
//		poles[1] = 0;
//		poles[2] = 0;
//		main.solve(18, poles[0], poles[1], poles[2], 0, 1, 2);
//		assertNotEquals(1, poles[0]);
//		
//		poles[0] = 19;
//		poles[1] = 0;
//		poles[2] = 0;
//		main.solve(19, poles[0], poles[1], poles[2], 0, 1, 2);
//		assertNotEquals(1, poles[0]);
//		
//		poles[0] = 20;
//		poles[1] = 0;
//		poles[2] = 0;
//		main.solve(20, poles[0], poles[1], poles[2], 0, 1, 2);
//		assertNotEquals(1, poles[0]);
//		
//		poles[0] = 21;
//		poles[1] = 0;
//		poles[2] = 0;
//		main.solve(21, poles[0], poles[1], poles[2], 0, 1, 2);
//		assertNotEquals(1, poles[0]);
//		
//		poles[0] = 22;
//		poles[1] = 0;
//		poles[2] = 0;
//		main.solve(22, poles[0], poles[1], poles[2], 0, 1, 2);
//		assertNotEquals(1, poles[0]);
//		
//		poles[0] = 23;
//		poles[1] = 0;
//		poles[2] = 0;
//		main.solve(23, poles[0], poles[1], poles[2], 0, 1, 2);
//		assertNotEquals(1, poles[0]);
//		
//		poles[0] = 24;
//		poles[1] = 0;
//		poles[2] = 0;
//		main.solve(24, poles[0], poles[1], poles[2], 0, 1, 2);
//		assertNotEquals(1, poles[0]);
//		
//		poles[0] = 25;
//		poles[1] = 0;
//		poles[2] = 0;
//		main.solve(25, poles[0], poles[1], poles[2], 0, 1, 2);
//		assertNotEquals(1, poles[0]);
//		
//		poles[0] = 26;
//		poles[1] = 0;
//		poles[2] = 0;
//		main.solve(26, poles[0], poles[1], poles[2], 0, 1, 2);
//		assertNotEquals(1, poles[0]);
//		
//		poles[0] = 27;
//		poles[1] = 0;
//		poles[2] = 0;
//		main.solve(27, poles[0], poles[1], poles[2], 0, 1, 2);
//		assertNotEquals(1, poles[0]);
//		
//		poles[0] = 28;
//		poles[1] = 0;
//		poles[2] = 0;
//		main.solve(28, poles[0], poles[1], poles[2], 0, 1, 2);
//		assertNotEquals(1, poles[0]);
//		
//		poles[0] = 29;
//		poles[1] = 0;
//		poles[2] = 0;
//		main.solve(29, poles[0], poles[1], poles[2], 0, 1, 2);
//		assertNotEquals(1, poles[0]);
//		
//		poles[0] = 30;
//		poles[1] = 0;
//		poles[2] = 0;
//		main.solve(30, poles[0], poles[1], poles[2], 0, 1, 2);
//		assertNotEquals(1, poles[0]);
	}
}
