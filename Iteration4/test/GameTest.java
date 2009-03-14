import junit.framework.TestCase;


public class GameTest extends TestCase {
	public void test_can_create_a_new_game() {
		Game game = new Game(0,0);
		assertNotNull(game);
	}
	public void test_when_one_live_cell_mutates(){
		Game game = new Game(1,1);
		game.makeAlive(0,0);
		game.mutate();
		
		assertFalse(game.isAlive(0,0));
	}
	
	public void test_when_three_adajacent_live_cells_mutate(){
		Game game = new Game(3,3);
		game.makeAlive(0, 0);
		game.makeAlive(1, 0);
		game.makeAlive(1, 1);
		game.makeAlive(0, 1);
		
		game.mutate();
		
		assertTrue(game.isAlive(0, 0));
		assertTrue(game.isAlive(1, 1));
		assertTrue(game.isAlive(1, 0));
		assertTrue(game.isAlive(0, 1));
	}
}
