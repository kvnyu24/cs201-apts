package apt6;
import apt6.ListNode;
import java.util.*;

public class AlphaLength {
    public ListNode create (String[] words) {
        TreeSet<String> uniqueWords = new TreeSet<String>();
        for (String word: words) {
            uniqueWords.add(word);  
        }

        String[] wordsArray = new String[uniqueWords.size()];
        uniqueWords.toArray(wordsArray);
        for (String word: wordsArray) {
            System.out.print(word);
        }
  

        ListNode first = new ListNode(wordsArray[0].length(), null);
        ListNode last = first;
        for (int i=1; i<wordsArray.length; i++) {
            last.next = new ListNode(wordsArray[i].length());
            last = last.next;
        }
        
        return first;
    }
}
