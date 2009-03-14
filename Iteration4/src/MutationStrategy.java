
public class MutationStrategy {
	
	public Cell nextCellState(Cell liveCell, Cell[] neighbors) {
		int live_neighbor_count = 0;
		for (int i = 0; i < neighbors.length; i++) {
			if (neighbors[i].isAlive())
				live_neighbor_count++;
		}
		return new Cell(live_neighbor_count == 3);
	}

}
