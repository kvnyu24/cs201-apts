package apt5;
import java.util.*;

public class Aaagmnrs {
    public String[] anagrams(String[] phrases) {
        ArrayList<String> ret = new ArrayList<String>();
        Set<String> mySet = new TreeSet<String>();
        ret.add(phrases[0]);
        mySet.add(sortString(phrases[0].toLowerCase().replaceAll("\\s+","")));

        for (int i=1; i<phrases.length; i++) {
            String checkStr = sortString(phrases[i].toLowerCase().replaceAll("\\s+",""));
            if (!mySet.contains(checkStr)) {
                ret.add(phrases[i]);
                mySet.add(checkStr);
            }
        }

        return ret.toArray(new String[ret.size()]);
    }

    public String sortString(String input) {
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
