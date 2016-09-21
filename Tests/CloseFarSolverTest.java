import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by bearden-tellez on 9/21/16.
 */

public class CloseFarSolverTest {
    CloseFarSolver solver;

    @Before
    public void setUp() throws Exception {
        solver = new CloseFarSolver();
    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void testAllSameNumber() throws Exception {
        boolean thisTest = solver.solveCloseFar(5, 5, 5);
        assertTrue(false);
    }

    @Test
    public void testBothBCMoreThanOneAway() throws Exception {
        boolean thisTest = solver.solveCloseFar(1, 25, 30);
        assertTrue(false);
    }
    @Test
    public void testBothBCAreOneAway() throws Exception {
        boolean thisTest = solver.solveCloseFar(30, 31, 29);
        assertTrue(false);
    }

    @Test
    public void testShouldPass() throws Exception {
        boolean thisTest = solver.solveCloseFar(56, 60, 55);
        assertTrue(true);
    }

}
