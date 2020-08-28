package apt2;
import java.util.*; 


public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        String ret = "";
        int maxCount = 0;
        int maxLen = 0;

        for (String strand: strands) {
            if (strand.contains(nuc)) {
                int count = strand.length() - strand.replaceAll(nuc,"").length();
                if (count > maxCount) {
                    ret = strand;
                    maxCount = count;
                    maxLen = strand.length();
                } else if (count == maxCount) {
                    if (strand.length() > maxLen) {
                        ret = strand;
                        maxLen = strand.length();
                    }
                }
            }
        }

        return ret;

        // Hashtable<String, Integer> strandCount = new Hashtable<String, Integer>(); 

        // // Update dict with count values
        // for (String strand: strands) {
        //     if (strand.contains(nuc)) {
        //         int count = strand.length() - strand.replaceAll(nuc,"").length();
        //         strandCount.put(strand, count);
        //     }
        // }

        // // Find the key-val pair with maximum count value
        // String maxKey = "";
        // int maxValue = 0;
        
        // for (Map.Entry<String, Integer> entry : strandCount.entrySet()) {
        //     if (entry.getValue() > maxValue) {
        //         maxValue = entry.getValue();
        //         maxKey = entry.getKey();
        //     }
        // }
        
        // return maxKey;
    }
}
