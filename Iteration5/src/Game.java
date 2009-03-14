
public class Game {
	private Cell[][] cells;
	
	public void setup(String[] initialState) {
		cells = new Cell[initialState.length][initialState.length];
		for (int i = 0; i < initialState.length; i++) {
			for (int j = 0; j < initialState[i].length(); j++) {
				cells[i][j] = new Cell(initialState[i].charAt(j));
			}
		}
		
	}

	public void mutate() {
		// TODO Auto-generated method stub
		
	}

	public String[] getState() {
		String[] state = new String[cells.length];
		
		for (int i = 0; i < cells.length; i++) {
			String row = "";
			for (int j = 0; j < cells.length; j++) {
				row += cells[i][j].isAlive() ? "1" : "0";
			}
		}
		
		return state;
	}

}
