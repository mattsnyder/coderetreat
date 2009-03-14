package conway;


public class DeadCellBehaviorTest extends CellBehaviorTest {
	public void test_when_three_live_neighbors(){
		Cell deadCell = new Cell();
		deadCell.setIsLive(false);
		deadCell.addNeighbor(createLiveCell());
		deadCell.addNeighbor(createLiveCell());
		deadCell.addNeighbor(createLiveCell());
		deadCell.Mutate();
		
		assertCellIsLive(deadCell);
	}
}
