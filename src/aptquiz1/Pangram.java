// package aptquiz1;
import java.util.*;

public class Pangram {
    public String[] find(String[] phrases){
        // Set<String> panSet = new HashSet<>();
        ArrayList<String> pan = new ArrayList<String>();


        for (String phrase: phrases) {
            BitSet alpha = new BitSet(26);
            for(char ch : phrase.toUpperCase().toCharArray())
                if(Character.isLetter(ch))
                    alpha.set(ch - 65);
        
            if (alpha.cardinality() == 26) {
                pan.add(phrase);
            }
        
            // if (phrase.chars()
            // .filter(i -> i >= 'a' && i <= 'z')
            // .distinct().count() == 26) {
            //     pan.add(phrase);
            // }
            // Set<String> letterSet = new HashSet<>();
            // for (String str : phrase.split("")) {
            //     letterSet.add(str);
            // }
        }
        Collections.sort(pan);

        return pan.toArray(new String[pan.size()]);
    }
}
