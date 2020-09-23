package apt3;
import java.util.*;

public class BigWord {
    public String most(String[] sentences) {
        HashMap<String, Integer> wordCount = new HashMap<>(); 

        for (String sent: sentences) {
            sent = sent.toLowerCase();
            String[] words = sent.split("\\s+");
            for (String word: words) {
                if (!wordCount.containsKey(word)) {
                    wordCount.put(word, 1);
                } else {
                    wordCount.put(word, wordCount.get(word) + 1);
                }
            }
        }

        Map.Entry<String, Integer> maxEntry = null;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }

        // System.out.println(maxEntry.getKey());

        return maxEntry.getKey();
    }
}