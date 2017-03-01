import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest{
	
	@Test
	public void spawnRockTest() {
		Board test = new Board(1);
		test.spawnRock();
	}
	
	@Test 
	public void spawnRockTest2() {
		Board test = new Board(0);
		test.spawnRock();
	}
	@Test
	public void setTimerTest() {
		Board test = new Board(0);
		test.setTimer(3);
	}
	@Test
	public void setTimerTest2() {
		Board test = new Board(0);
		test.setTimer(5);
	}
	@Test 
	public void moveRockTest() {
		Board test = new Board(0);
		test.spawnRock();
		test.spawnRock();
		test.spawnRock();
		test.moveRocks();
	}
	@Test 
	public void moveRockTest2() {
		Board test = new Board(2);
		test.moveRocks();
	}
	@Test
	public void removeRockTest() {
		Board test = new Board(2);
		test.spawnRock();
		test.removeRock(0);
	}
	@Test
	public void removeRockTest2() {
		Board test = new Board(2);
		test.spawnRock();
		test.spawnRock();
		test.removeRock(1);
	}
	@Test
	public void moveRightTest() {
		Board test = new Board(0);
		test.moveRight();
	}
	
	@Test
	public void moveRightTest2() {
		Board test = new Board(0);
		test.player = new Player(0, 0);
		test.player.setXcoord(0);
		test.moveRight();
	}
	
	@Test
	public void moveRightTest3() {
		Board test = new Board(0);
		test.player = new Player(0, 38);
		test.moveRight();
	}
	
	@Test
	public void moveLeftTest() {
		Board test = new Board(0);
		test.moveLeft();
	}
	
	@Test
	public void moveLeftTest2() {
		Board test = new Board(0);
		test.player = new Player(0, 0);
		test.moveLeft();
	}
	
	@Test
	public void moveLeftTest3() {
		Board test = new Board(0);
		test.player = new Player(0, 38);
		test.moveLeft();
	}
	
	@Test 
	public void takeTurnTest() {
		Board test = new Board(49);
		test.takeTurn('o');
	}
	
	@Test 
	public void takeTurnTest2() {
		Board test = new Board(49);
		test.takeTurn('h');
	}
	
	@Test
	public void processCharTest() {
		Board test = new Board(0);
		test.processChar('p');
	}
	
	@Test
	public void processCharTest2() {
		Board test = new Board(0);
		test.processChar('o');
	}
	
	@Test
	public void processCharTest3() {
		Board test = new Board(0);
		test.processChar('k');
	}
	
	@Test
	public void processCharTest4() {
		Board test = new Board(0);
		test.processChar('a');
	}
	
	@Test
	public void scoringTest() {
		Board test = new Board(0);
		test.scoring(5, 30);
	}
	
	@Test
	public void scoringTest2() {
		Board test = new Board(49);
		test.scoring(600, 0);
	}
	
	@Test
	public void scoringTest3() {
		Board test = new Board(49);
		test.scoring(700, 0);
	}
	@Test
	public void scoringTest4() {
		Board test = new Board(49);
		test.scoring(500, 0);
	}
	
	@Test
	public void scoringTest5() {
		Board test = new Board(49);
		test.scoring(400, 0);
	}
	
	@Test
	public void scoringTest6() {
		Board test = new Board(49);
		test.scoring(300, 0);
	}
	
	@Test
	public void scoringTest7() {
		Board test = new Board(49);
		test.scoring(200, 0);
	}
}
