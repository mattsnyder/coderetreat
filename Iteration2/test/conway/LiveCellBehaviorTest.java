package conway;

import junit.framework.TestCase;

public class LiveCellBehaviorTest extends TestCase {
	public void test_when_has_one_live_neighbor_and_two_dead_neighbor(){
		Cell liveCell = createLiveCell();
		
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
