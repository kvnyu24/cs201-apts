// package aptquiz2;
import java.util.*;

public class SpecialSort {
    public String[] specialStrings;

    public String[] sort(String[] data, String[] special) {
        specialStrings = special;
        Arrays.sort(data, new Comp());

        return data;
    }
    
    private class Comp implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            boolean v1 = Arrays.asList(specialStrings).contains(o1);
            boolean v2 = Arrays.asList(specialStrings).contains(o2);

            if (v1 && v2) return o1.compareTo(o2);
            if (!v1 && !v2) return o1.compareTo(o2);
            if (v1) return -1;
            return 1;
        }
    }
}

