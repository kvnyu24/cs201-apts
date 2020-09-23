package apt5;
import java.util.*;

public class PairDown {
    public int[] fold(int[] list) {
        ArrayList<Integer> sums = new ArrayList<Integer>();

        for (int i=0; i<list.length; i+=2) {
            if (i!=list.length-1) {
                sums.add(list[i] + list[i+1]);
            } else {
                sums.add(list[i]);
            }
        }

        // change this code
        return sums.stream().mapToInt(i -> i).toArray();
    }
}
