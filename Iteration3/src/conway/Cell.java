package conway;

import java.util.ArrayList;

public class Cell {

	private boolean iAmAlive = true;
	private ArrayList neighbors;
	
	public Cell() {
		neighbors = new ArrayList();
	}
	
	public void Mutate() {
		int aliveCount = 0;
		
		for(int index = 0; index < neighbors.size(); index++)
		{
			Cell current = (Cell) neighbors.get(index);
			if (current.isAlive() == true)
				aliveCount++;
		}
		
		if (isAlive()) {
			iAmAlive = (aliveCount == 2 || aliveCount == 3);
		}
		else {
			iAmAlive = (aliveCount == 3);
		}
	}

	public boolean isAlive() {
		return iAmAlive;
	}

	public boolean isDead() {
		return !iAmAlive;
	}

	public void addNeighbor(Cell neighbor) {
		neighbors.add(neighbor);
	}

	public void setIsLive(boolean value) {
		iAmAlive = value;
	}

}
