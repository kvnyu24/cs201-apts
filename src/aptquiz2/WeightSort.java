// package aptquiz2;
import java.util.*;

public class WeightSort {
    public String[] sort(String[] strs) {
        Arrays.sort(strs, new Comp());
        return strs;
    }

    private class Comp implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            int w1 = 0;
            int w2 = 0;

            o1 = o1.toLowerCase();
            o2 = o2.toLowerCase();

            for (int i=0; i<o1.length(); i++) {
                char c = o1.charAt(i);
                int w = c-'a' +1;
                w1 += w;
            }

            for (int i=0; i<o2.length(); i++) {
                char c = o2.charAt(i);
                int w = c-'a' +1;
                w2 += w;
            }

            
            if (w1>w2) return 1;
            if (w2>w1) return -1;
            if (w1==w2) return o1.compareTo(o2);

            return 0;
        }
    }


 }
