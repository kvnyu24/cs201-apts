package apt4;
import java.util.*;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, 
                                  String[] club2, 
                                  String[] club3) 
        {
            ArrayList<String> badGuys = new ArrayList<String>();
            HashMap<String, Integer> counts = new HashMap<String, Integer>();
            this.checkClub(counts, club1);
            this.checkClub(counts, club2);
            this.checkClub(counts, club3);

            for (String key: counts.keySet()) {
                if (counts.get(key) > 1) {
                    badGuys.add(key);
                } 
            }
            
            String[] ret = badGuys.toArray(new String[badGuys.size()]);
            Arrays.sort(ret);
            
            return ret;
    }

    public HashMap<String, Integer> checkClub(HashMap<String, Integer> map, String[] club) {
        Set<String> clubSet = new HashSet<String>(Arrays.asList(club));
        for (String member: clubSet) {
            map.putIfAbsent(member, 0);
            map.put(member, map.get(member)+1);
        }
        return map;
    }
}