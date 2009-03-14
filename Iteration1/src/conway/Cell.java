package conway;

import java.util.ArrayList;

public class Cell {

	private boolean isLive;
	private ArrayList neighbors;

	public Cell() {
		neighbors = new ArrayList();
	}
	
	public void Tick() {
		
	}

	public boolean isLive() {
		return neighbors.size() == 3;
	}

	public void setIsLive(boolean b) {
		
	}

	public void addNeighbor(Cell neighbor) {
		neighbors.add(neighbor);
	}

}
