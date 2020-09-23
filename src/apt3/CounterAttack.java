package apt3;
import java.util.*;

public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        String[] characters = str.split("\\s+");
        ArrayList<Integer> ret = new ArrayList<Integer>();

        for (String word: words) {
            int count = Collections.frequency(Arrays.asList(characters), word);
            // int count = (str.length() - str.replaceAll(" " + word,"").length())/(word.length()+1);
            ret.add(count);
        }

        int[] retArray = new int[ret.size()];
        for(int i=0; i < ret.size(); i++) {
            retArray[i] = ret.get(i).intValue();
        }

        return retArray;
    }
}
