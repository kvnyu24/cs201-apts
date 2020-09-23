package apt4;
import java.util.*;

public class IsomorphicWords {
    public int countPairs(String[] words) {
        int len = words.length;
        int count = 0;

        for (int i=0; i<len; i++) {
            for (int j=i+1; j<len; j++) {
                if (this.checkIsomorph(words[i], words[j])) {
                    count += 1;
                }
            }
        }

        return count;
    }

    public boolean checkIsomorph(String word1, String word2) {
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i=0; i<word1.length(); i++) {
            if (!map.containsKey(word1.substring(i, i+1))) {
                map.put(word1.substring(i, i+1), word2.substring(i, i+1));
            } else if (!word2.substring(i, i+1).equals(map.get(word1.substring(i, i+1)))) {
                return false;
            }
        }

        if (this.duplicates(map.values().toArray(new String[map.values().toArray().length]))) {
            return false;
        }

        return true;
    }

    public boolean duplicates(final String[] list) {
        Set<String> lump = new HashSet<String>();
        for (String i : list){
            if (lump.contains(i)) return true;
            lump.add(i);
        }
        return false;
    }

 }
