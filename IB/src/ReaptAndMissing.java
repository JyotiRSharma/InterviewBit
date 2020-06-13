import java.util.ArrayList;
import java.util.List;

public class ReaptAndMissing {
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int n = A.size();
        boolean[] present = new boolean[n+1];
        int repeat = 0;
        for (int i = 0; i < n; i++) {
            if (present[A.get(i)] == true) {
                repeat = A.get(i);
            } else {
                present[A.get(i)] = true;
            }
        }


        int missing = 0;
        for(int i = 0; i < n; i++) {
            if (!A.contains(i)) {
                missing = i;
            }
        }

        ArrayList<Integer> al = new ArrayList<>(2);
        al.add(repeat);
        al.add(missing);

        return al;
    }
}
