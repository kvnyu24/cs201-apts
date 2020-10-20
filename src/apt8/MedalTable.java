package apt8;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Map.Entry;


public class MedalTable {
    public String[] generate(String[] results) {
        HashMap<String, int[]> medalCount = new HashMap<>();
        for (String res: results) {
            String[] resStr = res.split(" ");
            for (int i=0; i<3; i++) {
                medalCount.putIfAbsent(resStr[i], new int[]{0, 0, 0});
                int[] origArr = medalCount.get(resStr[i]);
                if(i==0) {
                    medalCount.put(resStr[i], new int[]{origArr[0]+1, origArr[1], origArr[2]});
                } else if (i==1) {
                    medalCount.put(resStr[i], new int[]{origArr[0], origArr[1]+1, origArr[2]});
                } else if (i==2) {
                    medalCount.put(resStr[i],new int[]{origArr[0], origArr[1], origArr[2]+1});
                }
            }
        }

        ArrayList<Medal> medalArrList = new ArrayList<>();
        for (String key: medalCount.keySet()) {
            int[] nums = medalCount.get(key);
            medalArrList.add(new Medal(key, nums[0], nums[1], nums[2]));
        }

        Comparator<Medal> compareMedal =  Comparator.comparing(Medal::getGold).thenComparing(Medal::getSilver).thenComparing(Medal::getBronze).thenComparing(Medal::getName, Comparator.reverseOrder());

        Collections.sort(medalArrList, compareMedal);
        Collections.reverse(medalArrList);

        

        // HashMap<String, int[]> sortedKey = medalCount.entrySet().stream()
        // .sorted(Collections.reverseOrder(Entry.comparingByKey()))
        // .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
        //                           (e1, e2) -> e1, LinkedHashMap::new));

        // HashMap<String, int[]> sortedVal = sortedKey.entrySet().stream()
        // .sorted(Entry.comparingByValue(Comparator.comparing((int[] i1, int[] i2) -> i1[0]-i2[0]).thenComparing(Entry::getValue[1]).thenComparing(Entry::getValue[2])))
        // .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
        //                         (e1, e2) -> e1, LinkedHashMap::new));

        ArrayList<String> ret = new ArrayList<>();
        for (Medal med: medalArrList) {
            ret.add(med.toString());
        }
        // for (String key: sortedVal.keySet()) {
        //     int[] nums = sortedVal.get(key); 
        //     ret.add(key + ' ' + Integer.toString(nums[0]) + ' ' + Integer.toString(nums[1]) + ' ' + Integer.toString(nums[2]));
        // }

        
        return ret.toArray(new String[ret.size()]);    

    }

    private class Medal {
        private String country;
        private int numGold;
        private int numSilver;
        private int numBronze;

        public Medal(String country, int numGold, int numSilver, int numBronze) {
            this.country = country;
            this.numGold = numGold;
            this.numSilver = numSilver;
            this.numBronze = numBronze;
        }

        public int getGold() {
            return this.numGold;
        }
        
        public int getSilver() {
            return this.numSilver;
        }
        
        public int getBronze() {
            return this.numBronze;
        }

        public String getName() {
            return this.country;
        }

        @Override
        public String toString() {
            return country + ' ' + Integer.toString(numGold) + ' ' + Integer.toString(numSilver) + ' ' + Integer.toString(numBronze);
        }
    }
}
 