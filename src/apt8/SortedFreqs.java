package apt8;
import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        if (data.length == 0) {
            return new int[0];
        }
        Arrays.sort(data);
       
        HashMap<String, Integer> count = new HashMap<>(); 
        for (String val: data) {
            count.putIfAbsent(val, 0);
            count.put(val, count.get(val)+1);
        }

        ArrayList<String> unique = new ArrayList<>();
        unique.add(data[0]);
        
        for (int i=1; i< data.length; i++) {
            if (!data[i].equals(data[i-1])) {
                unique.add(data[i]);
            }
        }

        String[] uniqArr = unique.toArray(new String[unique.size()]);

        int[] ret = new int[uniqArr.length];
        for (int i=0; i<uniqArr.length; i++) {
            ret[i] = count.get(uniqArr[i]);
        }

        return ret;

    }
 }
