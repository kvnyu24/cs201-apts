package apt6;
import apt6.ListNode;
import java.util.*;

public class MergeLists {
    public ListNode weave (ListNode a, ListNode b) {
        ListNode mergedFirst = new ListNode(a.info);
        ListNode mergedLast = mergedFirst;
        mergedLast.next = new ListNode(b.info);
        mergedLast = mergedLast.next;
        a = a.next;
        b = b.next;


        while (a != null && b != null) {
            System.out.println(a.info);
            mergedLast.next = new ListNode(a.info);
            mergedLast = mergedLast.next;
            mergedLast.next = new ListNode(b.info);
            mergedLast = mergedLast.next;
            a = a.next;
            b = b.next;
        }
    return mergedFirst;
    }
}
