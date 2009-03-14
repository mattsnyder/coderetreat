package conway;

import junit.framework.TestCase;

public abstract class CellBehaviorTest extends TestCase {

	public CellBehaviorTest() {
		super();
	}

	public CellBehaviorTest(String name) {
		super(name);
	}

	protected Cell createDeadCell() {
		Cell cell = new Cell();
		cell.setIsLive(false);
		return cell;
	}

	protected Cell createLiveCell() {
		return new Cell();
	}

	protected void assertCellIsLive(Cell cell) {
		assertTrue(cell.isAlive());
		assertFalse(cell.isDead());
	}

	protected void assertCellIsDead(Cell cell) {
		assertFalse(cell.isAlive());
		assertTrue(cell.isDead());
	}

}