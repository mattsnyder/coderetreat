package conway;

import junit.framework.TestCase;

public class DeadCellBehaviorTest extends TestCase {

	private Cell deadCell;

	// The universe of the Game of Life is an infinite two-dimensional
	// orthogonal grid of square cells,
	// each of which is in one of two possible states, live or dead. Every cell
	// interacts with its eight neighbours,
	// which are the cells that are directly horizontally, vertically, or
	// diagonally adjacent. At each step in time,
	// the following transitions occur:
	//
	// 1. Any live cell with fewer than two live neighbours dies, as if by needs
	// caused by underpopulation.
	// 2. Any live cell with more than three live neighbours dies, as if by
	// overcrowding.
	// 3. Any live cell with two or three live neighbours lives, unchanged, to
	// the next generation.
	// 4. Any dead cell with exactly three live neighbours becomes a live cell.
	//
	// The initial pattern constitutes the 'seed' of the system. The first
	// generation is created by applying
	// the above rules simultaneously to every cell in the seed Ñ births and
	// deaths happen simultaneously,
	// and the discrete moment at which this happens is sometimes called a tick.
	// (In other words,
	// each generation is a pure function of the one before.) The rules continue
	// to be applied
	// repeatedly to create further generations.
	
	protected void setUp() throws Exception {
		deadCell = createDeadCell();
	}

	public void test_dead_cell_with_no_neighbors_does_not_change_state() {
		deadCell.Tick();

		assertFalse(deadCell.isLive());
	}

	public void test_dead_cell_with_three_live_neighbors_does_change_state() {
		deadCell.addNeighbor(createLiveCell());
		deadCell.addNeighbor(createLiveCell());
		deadCell.addNeighbor(createLiveCell());
		deadCell.Tick();

		assertTrue(deadCell.isLive());
	}

	public void test_dead_cell_with_one_live_neighbor_does_not_change_state() {
		deadCell.addNeighbor(createLiveCell());
		deadCell.Tick();

		assertFalse(deadCell.isLive());
	}
	
	public void test_dead_cell_with_one_live_neighbor

	private Cell createDeadCell() {
		return new Cell();
	}

	private Cell createLiveCell() {
		Cell newCell = new Cell();
		newCell.setIsLive(true);
		return newCell;
	}
}
