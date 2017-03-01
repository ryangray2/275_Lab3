import static org.junit.Assert.*;

import org.junit.Test;

public class RockTest {

	@Test
	public void getXTest() {
		Rock test = new Rock(4, 6);
		test.getX();
	}
	@Test
	public void getXTest2() {
		Rock test = new Rock(2, 7);
		test.getX();
	}
	
	@Test
	public void getYTest() {
		Rock test = new Rock(4,6);
		int result = test.getY();
		assertEquals(0, result);
	}
	
	@Test
	public void getYTest2() {
		Rock test = new Rock(2,7);
		int result = test.getY();
		assertEquals(0, result);
	}
	
	@Test
	public void setXTest() {
		Rock test = new Rock(4, 6);
		test.setxCoord(3);
		int result = test.getX();
		assertEquals(3, result);
	}
	
	@Test
	public void setXTest2() {
		Rock test = new Rock(2, 7);
		test.setxCoord(9);
		int result = test.getX();
		assertEquals(9, result);
	}
	
	@Test
	public void setYTest() {
		Rock test = new Rock(4, 6);
		test.setyCoord(3);
		int result = test.getY();
		assertEquals(3, result);
	}
	
	@Test
	public void setYTest2() {
		Rock test = new Rock(2, 7);
		test.setyCoord(9);
		int result = test.getY();
		assertEquals(9, result);
	}
	
	@Test 
	public void moveRockTest() {
		Rock test = new Rock(4, 6);
		test.setyCoord(3);
		test.moveRock();
		int result = test.getY();
		assertEquals(result, 4);
	}
	
	@Test 
	public void moveRockTest2() {
		Rock test = new Rock(2, 7);
		test.setyCoord(9);
		test.moveRock();
		int result = test.getY();
		assertEquals(result, 10);
	}
	
	@Test
	public void toStringTest() {
		Rock test = new Rock(4, 6);
		assertEquals("O", test.toString());
	}
	
	@Test
	public void toStringTest2() {
		Rock test = new Rock(2, 7);
		assertEquals("O", test.toString());
	}

}
