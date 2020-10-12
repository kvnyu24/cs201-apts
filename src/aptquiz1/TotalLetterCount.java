// package aptquiz1;
import java.util.*;

public class TotalLetterCount {
    public int total(String[] words, String letter) {
        int sum = 0;
        for (int i=0; i<words.length; i++) {
            sum += i * (words[i].length() - words[i].replaceAll(letter,"").length());
        }
        return sum;
    }
}
