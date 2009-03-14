
public class Cell {

	private boolean iAmAlive;

	public Cell(char initialState) {
		iAmAlive = (initialState == '1');
	}

	public boolean isAlive() {
		return iAmAlive;
	}

}
