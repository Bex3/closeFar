/**
 * Created by bearden-tellez on 9/21/16.
 */
public class CloseFarSolver {

    public boolean solveCloseFar (int a, int b, int c) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        int absC = Math.abs(c);

        if (absA == absB && absA == absC) {
            return false;
        } else if ((absA + 1) == absB && (absA + 1) == absC) {
            return false;
        } else if ((absA - 1) == absB && (absA - 1) == absC) {
            return false;
        } else if ((absA - 1) == absB || ((absA - 1) == absC) || ((absA + 1) == absB) || ((absA) + 1) == absC) {
                if (((absA - absB == 1) && (absA - absC >= 2)) || (absA - absC == 1 && (absA - absB >= 2)))
            return true;
        }
        return false;
    }
}
