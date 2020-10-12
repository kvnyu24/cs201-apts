// package aptquiz1;
import java.util.*;

public class UniqueNodes {
    public int sum(ListNode list) {
        int sum = 0;
        HashSet<Integer> uniqueSet = new HashSet<>();

        while(list != null) {
            if (!uniqueSet.contains(list.info)) {
                sum += list.info;
                uniqueSet.add(list.info);
            }
            list = list.next;
        }        

        return sum;
    }
}
