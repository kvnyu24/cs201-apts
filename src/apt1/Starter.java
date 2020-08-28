package apt1;
import java.util.*;


public class Starter {
    public int begins(String[] words, String first) {
        int num = 0;
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));

        for (String str : wordSet) {
            if (str.substring(0, 1).equals(first)) {
                num += 1;
            }
        }

        // replace this code
        return num;
    }
}
