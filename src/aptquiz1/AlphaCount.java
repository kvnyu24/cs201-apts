package aptquiz1;
import java.util.*;

public class AlphaCount {
    public int[] sizing(String[] words) {
        TreeMap<String, Integer> wordCount = new TreeMap<>(); 
        for (String word: words) {
            if (!wordCount.containsKey(word)) {
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, wordCount.get(word) + 1);
            }
        }

        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int num: wordCount.values()) {
            ret.add(num);
        }

        return ret.stream().mapToInt(i -> i).toArray();
    }
}
