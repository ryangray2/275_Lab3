import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void getXTest() {
		Player test = new Player(4, 6);
		int result = test.getX();
		assertEquals(result, 3);
	}

	@Test
	public void getXTest2() {
		Player test = new Player(4, 8);
		int result = test.getX();
		assertEquals(result, 4);
	}

	@Test
	public void getYTest() {
		Player test = new Player(4, 6);
		int result = test.getY();
		assertEquals(result, 4);
	}

	@Test
	public void getYTest2() {
		Player test = new Player(55, 2);
		test.setYcoord(56);
		int result = test.getY();
		assertEquals(result, 56);
	}

	@Test
	public void getScoreTest() {
		Player test = new Player(55, 2);
		int result = test.getScore();
		assertEquals(result, 0);
	}

	@Test
	public void getScoreTest2() {
		Player test = new Player(30, 5);
		int result = test.getScore();
		assertEquals(result, 0);
	}

	@Test
	public void setXcoordTest() {
		Player test = new Player(4, 6);
		test.setXcoord(5);
		int result = test.getX();
		assertEquals(result, 5);
	}

	@Test
	public void setXcoordTest2() {
		Player test = new Player(4, 6);
		test.setXcoord(10);
		int result = test.getX();
		assertEquals(result, 10);
	}

	@Test
	public void setYcoordTest() {
		Player test = new Player(4, 6);
		test.setYcoord(5);
		int result = test.getY();
		assertEquals(result, 5);
	}

	@Test
	public void setYcoordTest2() {
		Player test = new Player(4, 6);
		test.setYcoord(10);
		int result = test.getY();
		assertEquals(result, 10);
	}

	@Test
	public void moveLeftTest() {
		Player test = new Player(4, 6);
		test.moveLeft();
		int result = test.getX();
		assertEquals(result, 2);
	}

	@Test
	public void moveLeftTest2() {
		Player test = new Player(4, 10);
		test.moveLeft();
		int result = test.getX();
		assertEquals(result, 4);
	}
	
	@Test
	public void moveRightTest() {
		Player test = new Player(4, 6);
		test.moveRight();
		int result = test.getX();
		assertEquals(result, 4);
	}

	@Test
	public void moveRightTest2() {
		Player test = new Player(4, 10);
		test.moveRight();
		int result = test.getX();
		assertEquals(result, 6);
	}
	
	@Test
	public void toStringTest() {
		Player test = new Player(4, 6);
		String result = test.toString();
		assertEquals(result, "X");
	}

	@Test
	public void toStringTest2() {
		Player test = new Player(4, 8);
		String result = test.toString();
		assertEquals(result, "X");
	}
	
	@Test
	public void upScoreTest() {
		Player test = new Player(4, 6);
		test.upScore();
		int result = test.getScore();
		assertEquals(result, 1);
	}

	@Test
	public void upScoreTest2() {
		Player test = new Player(3, 20);
		test.upScore();
		int result = test.getScore();
		assertEquals(result, 1);
	}
	
	@Test
	public void getTimeTest() {
		Player test = new Player(3, 20);
		test.getTime();
	}
	
	@Test
	public void getTimeTest2() {
		Player test = new Player(3, 40);
		test.getTime();
	}
}
