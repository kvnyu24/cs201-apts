package apt7;
import apt7.ListNode;
import java.util.*;


public class DoubleList {
    public ListNode bigify(ListNode list) {
        ListNode last = list;

        while(last != null) {
            ListNode next = last.next;
            last.next = new ListNode(last.info);
            last.next.next = next;
            last = last.next.next;
        }
        return list;
    }
}
