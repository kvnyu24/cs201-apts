package apt3;
import java.util.*;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        ArrayList<String> filtered = new ArrayList<String>(); 

        for (String word: list) {
            if (word.length() >= minLength && !filtered.contains(word)) {
                    filtered.add(word);
                }
        }

        return filtered.toArray(new String[filtered.size()]);
    }
}
