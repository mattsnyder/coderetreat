package conway;
import junit.framework.TestCase;


public class DeadCellBehaviorTest extends TestCase {

	Cell deadCell;
	
	protected void setUp() throws Exception {
		deadCell = createDeadCell();
	}
	
	public void test_when_no_neighbors(){
		deadCell.Tick();
		
		assertTrue(deadCell.isDead());
	}

	public void test_when_has_three_live_neighbors(){
		deadCell.addNeighbor(createLiveCell());
		deadCell.addNeighbor(createLiveCell());
		deadCell.addNeighbor(createLiveCell());
		deadCell.Tick();
		
		assertFalse(deadCell.isDead());
	}
	
	public void test_when_has_two_live_neighbors(){
		deadCell.addNeighbor(createLiveCell());
		deadCell.addNeighbor(createLiveCell());
		deadCell.Tick();
		
		assertTrue(deadCell.isDead());
	}
	
	public void test_when_has_two_live_neighbors_and_one_dead_neighbor(){
		deadCell.addNeighbor(createLiveCell());
		deadCell.addNeighbor(createLiveCell());
		deadCell.addNeighbor(createDeadCell());
		deadCell.Tick();
		
		assertTrue(deadCell.isDead());
	}

	private Cell createDeadCell() {
		return new Cell();
	}
	
	private Cell createLiveCell() {
		Cell cell = new Cell();
		cell.setIsDead(false);
		return cell;
	}
}
