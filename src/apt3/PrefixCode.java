package apt3;

public class PrefixCode { 
    public String isOne(String[] words) {

        for (int i=0; i < words.length; i++) {
            for (int j=0; j < words.length; j++) {
                if (!(i==j) && words[j].startsWith(words[i])) {
                    String ret = String.format("No, %d", i);
                    return ret;
                }
            }
        }

        String ret = "Yes";
        return ret;
    }
 }
