import java.util.ArrayList;

import junit.framework.TestCase;


public class MutationStrategyTest extends TestCase {
	private MutationStrategy strategy;
	private Cell liveCell;
	
	public void test_can_create_mutation_strategy() {
		MutationStrategy strategy = new MutationStrategy();
		assertNotNull(strategy);
	}
	
	public void test_live_cell_with_no_neighbors_dies() {
		MutationStrategy strategy = new MutationStrategy();
		Cell liveCell = new Cell(true);
		Cell live_neighbors[] = new Cell[8];
		for (int i = 0; i < 8; i++) {
			live_neighbors[i] = new Cell(false);
		}
		Cell newCell = strategy.nextCellState(liveCell , live_neighbors);
		assertFalse(newCell.isAlive());
	}
	
	protected void setUp() throws Exception {
		strategy = new MutationStrategy();
		liveCell = new Cell(true);
	}

	public void test_live_cell_with_three_live_neighbors_lives_1(){
		
		boolean[] neighborhood = {false,true,true,true,false,false,false,false};
		Cell [] neighbors = createNeighbors(neighborhood);
		
		Cell newCell = strategy.nextCellState(liveCell , neighbors);
		assertTrue(newCell.isAlive());
	}
	
	public void test_live_cell_with_three_live_neighbors_lives_2(){
		boolean[] neighborhood = {false,true,true,true,false,false,false,false};
		Cell [] neighbors = createNeighbors(neighborhood);

		Cell newCell = strategy.nextCellState(liveCell , neighbors);
		assertTrue(newCell.isAlive());
	}

	private Cell[] createNeighbors(boolean[] neighborhood) {
		Cell[] neighbors = new Cell[neighborhood.length];
		for (int i = 0; i < neighborhood.length; i++) {
			neighbors[i] = new Cell(neighborhood[i]);
		}
		return neighbors;
	}
	
	
}
