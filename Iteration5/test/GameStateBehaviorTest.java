import junit.framework.TestCase;


public class GameStateBehaviorTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	

	public void test_one_by_one(){
		Game conway = new Game();
		conway.setup(new String[] {"0"});
		assertGameState(new String[] {"0"}, conway.getState());
	}
	
	public void test_two_by_two(){
		Game conway = new Game();
		conway.setup(new String[] {"00","00"});
		assertGameState(new String[] {"00","00"}, conway.getState());
	}

	private void assertGameState(String[] expectation, String[] actual) {
		assertTrue(actual.length == expectation.length);
		for (int i = 0; i < expectation.length; i++) {
			assertTrue(actual[i].equals(expectation[i]));
		}
		
	}
}
