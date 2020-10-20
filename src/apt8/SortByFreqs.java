package apt8;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Map.Entry;


public class SortByFreqs {
    public String[] sort(String[] values){
        HashMap<String, Integer> count = new HashMap<>(); 
        for (String val: values) {
            count.putIfAbsent(val, 0);
            count.put(val, count.get(val)+1);
        }
        ArrayList<String> ret = new ArrayList<>();
        HashMap<String, Integer> sortedKey = count.entrySet().stream()
        .sorted(Collections.reverseOrder(Entry.comparingByKey()))
        .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
                                  (e1, e2) -> e1, LinkedHashMap::new));

        HashMap<String, Integer> sortedVal = sortedKey.entrySet().stream()
        .sorted(Entry.comparingByValue())
        .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
                                  (e1, e2) -> e1, LinkedHashMap::new));
        for (String key: sortedVal.keySet()) {
            ret.add(key);
        }
        Collections.reverse(ret);
        return ret.toArray(new String[ret.size()]);    
    }
}
