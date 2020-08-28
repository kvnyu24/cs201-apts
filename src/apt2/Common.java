package apt2;
import java.util.*; 

public class Common {
    public int count (String a, String b) {
        // Create key-value pairs recording num of occurances of each character in each string
        Hashtable<String, Integer> aCount = new Hashtable<String, Integer>(); 
        Hashtable<String, Integer> bCount = new Hashtable<String, Integer>(); 
        
        Set<String> aSet = new HashSet<>();
        for (String str : a.split("")) {
            aSet.add(str);
        }
        Set<String> bSet = new HashSet<>();
        for (String str : b.split("")) {
            bSet.add(str);
        }

        for (String str: aSet) {
            int count = a.length() - a.replaceAll(str,"").length();
            aCount.put(str, count);
        }
        for (String str: bSet) {
            int count = b.length() - b.replaceAll(str,"").length();
            bCount.put(str, count);
        }

        
        // Create set of all characters within the two strings
        Set<String> mergedSet = new HashSet<>(); 
        Collections.addAll(mergedSet, aCount.keySet().toArray(new String[0])); 
        Collections.addAll(mergedSet, bCount.keySet().toArray(new String[0])); 


        // Final count
        int retCount = 0;
        for (String str: mergedSet) {
            // int countA = a.length() - a.replaceAll(str,"").length();
            // int countB = b.length() - b.replaceAll(str,"").length();
            int countA, countB;
            if (aCount.keySet().contains(str)) {
                countA = aCount.get(str);
            } else {
                countA = 0;
            }
            if (bCount.keySet().contains(str)) {
                countB = bCount.get(str);
            } else {
                countB = 0;
            }
            retCount += Math.min(countA, countB);                      
        }


        return retCount;
    }
 }
