package conway;

import java.util.ArrayList;

public class Cell {

	private ArrayList neighbors;
	private boolean iAmDead = true;

	public Cell() {
		neighbors = new ArrayList();
	}

	public void Tick() {
		int countOfLiveCells = 0;
		for (int index = 0; index < neighbors.size(); index++) {
			Cell aNeighbor = (Cell) neighbors.get(index);
			if (!aNeighbor.isDead())
				countOfLiveCells++;
		}

		if (countOfLiveCells == 3)
			iAmDead = false;
		else
			iAmDead = true;
	}

	public boolean isDead() {
		return iAmDead;
	}

	public void setIsDead(boolean value) {
		iAmDead = value;
	}

	public void addNeighbor(Cell cell) {
		neighbors.add(cell);
	}

}
