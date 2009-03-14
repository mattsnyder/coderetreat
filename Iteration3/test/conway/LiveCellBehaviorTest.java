package conway;


public class LiveCellBehaviorTest extends CellBehaviorTest {

	Cell liveCell;
	
	protected void setUp() throws Exception {
		liveCell = createLiveCell();
	}
	
	public void test_when_no_neighbors(){
		liveCell.Mutate();
		
		assertCellIsDead(liveCell);
	}
	
	public void test_when_two_live_neighbors(){
		liveCell.addNeighbor(createLiveCell());
		liveCell.addNeighbor(createLiveCell());
		liveCell.Mutate();
		
		assertCellIsLive(liveCell);
	}
	
	public void test_when_one_live_neighbor_and_one_dead_neighbor(){
		liveCell.addNeighbor(createLiveCell());
		liveCell.addNeighbor(createDeadCell());
		liveCell.Mutate();
		
		assertCellIsDead(liveCell);
	}
	
	public void test_when_three_live_neighbors(){
		liveCell.addNeighbor(createLiveCell());
		liveCell.addNeighbor(createLiveCell());
		liveCell.addNeighbor(createLiveCell());
		liveCell.Mutate();
		
		assertCellIsLive(liveCell);
	}
	
	public void test_when_four_live_neighbors(){
		liveCell.addNeighbor(createLiveCell());
		liveCell.addNeighbor(createLiveCell());
		liveCell.addNeighbor(createLiveCell());
		liveCell.addNeighbor(createLiveCell());
		liveCell.Mutate();
		
		assertCellIsDead(liveCell);
	}

}
