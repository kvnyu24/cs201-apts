package apt5;
import java.util.*;

public class MaxDonor {    
    public String generous(String[] orgs, int[] amount) {   
        HashMap<String,Integer> map = new HashMap<>();   
        for(int k=0; k < orgs.length; k+= 1) {   
            if (! map.containsKey(orgs[k])) {   
                map.put(orgs[k], 0);   
            }        
                map.put(orgs[k],map.get(orgs[k])+amount[k]);   
        }   
        int max = Collections.max(map.values());  
        for(String s : map.keySet()) {   
            if (map.get(s) == max) {   
                return String.format("%s:$%d", s,max);   
            }   
        }   
        return "";
    }
}
