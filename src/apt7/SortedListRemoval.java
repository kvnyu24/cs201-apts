package apt7;
import apt7.ListNode;
import java.util.*;


public class SortedListRemoval {
    public ListNode uniqify(ListNode list){
        ListNode last = list;
        while (last != null && last.next != null) {
            while (last.next.info==last.info) {
                if (last.next.next != null) {
                    last.next = last.next.next;
                } else {
                    last.next = null;
                    return list;
                }
            }
            last = last.next;
        }

        return list;
    }
}
