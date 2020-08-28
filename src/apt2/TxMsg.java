package apt2;
import java.util.*; 


public class TxMsg {
    public String getMessage(String original) {
        String ret = "";
        String[] vowels = new String[] {"a", "e", "i", "o", "u"};
        String[] words = original.split("\\s+");


        for (String word: words) {
            String retWord = "";

            // special case: all vowels
            boolean allVowels = true;
            for (int i = 0; i < word.length(); i++) {
                int idx = i;
                if (!Arrays.stream(vowels)
                .anyMatch(x -> word.substring(idx, idx+1).equals(x))) {
                    allVowels = false;
                }
            }
    
            if (allVowels) {
                retWord = word;
            } else {
                // general case
                if (!Arrays.stream(vowels)
                    .anyMatch(x -> word.substring(0, 1).equals(x))) {
                        retWord += word.substring(0, 1);
                }
        
                for (int i = 1; i < word.length(); i++) {
                    boolean add = true;
                    int idx = i;
        
                    if (Arrays.stream(vowels)
                    .anyMatch(x -> word.substring(idx, idx+1).equals(x))) {
                        add = false;
                    } else if (!Arrays.stream(vowels)
                    .anyMatch(x -> word.substring(idx-1, idx).equals(x))) {
                        add = false;
                    }
        
                    if (add) {
                        retWord += word.substring(idx, idx+1);
                    }
                }
            }
            ret += retWord;
            ret += " ";
        }

        return ret.substring(0, ret.length()-1);
    }
 }