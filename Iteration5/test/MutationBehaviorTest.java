import junit.framework.TestCase;


public class MutationBehaviorTest extends TestCase {

	protected void setUp() throws Exception {
		
	}
	
	
	public void test_mutating_with_one_live_cell(){
		Game conway = new Game();
		conway.setup(new String[]{"1"});
		conway.mutate();
		assertGameState(new String[]{"0"}, conway.getState());
	}
	
	public void test_mutating_with_one_live_and_four_dead_cells(){
		Game conway = new Game();
		conway.setup(new String[]{"10","00"});
		conway.mutate();
		assertGameState(conway.getState(), new String[]{"00","00"});
	}

	private void assertGameState(String[] expectation, String[] actual) {
		assertTrue(actual.length == expectation.length);
		for (int i = 0; i < expectation.length; i++) {
			assertTrue(actual[i].equals(expectation[i]));
		}
		
	}

}
