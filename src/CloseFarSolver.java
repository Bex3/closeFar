/**
 * Created by bearden-tellez on 9/21/16.
 */
public class CloseFarSolver {

    public boolean solveCloseFar (int a, int b, int c) {
        if (((Math.abs(a)) == (Math.abs(b))) && ((Math.abs(c)) == (Math.abs(a)))) {
            return false;
        } else if ((Math.abs(a)) + 1 == (Math.abs(b)) && ((Math.abs(a)) + 1) == (Math.abs(c))) {
            return false;
        } else if ((Math.abs(a)) - 1 == (Math.abs(b)) && ((Math.abs(a)) - 1) == (Math.abs(c))) {
            return false;
        } else if (((Math.abs(a)) - 1 == (Math.abs(b)) || ((Math.abs(a)) - 1) == (Math.abs(c))) || (Math.abs(a)) + 1 == (Math.abs(b)) || ((Math.abs(a)) + 1) == (Math.abs(c))) {
            return true;
        }
        return false;
    }
}
