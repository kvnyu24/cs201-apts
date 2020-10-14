package apt7;
import apt7.ListNode;
import java.util.*;

public class RemoveMin {
    public ListNode remove (ListNode list) {
        ListNode last = list;
        int min = this.minVal(list);

        if (last.info == min) {
            list = last.next;
        }
        while (last != null && last.next != null) {
            if (last.next.info == min) {
                last.next = last.next.next;
            }
            last = last.next;
        }

    return list;
    }

    public int minVal (ListNode list) {
        int min = list.info;

        while (list != null) {
            if (list.info < min) {
                min = list.info;
            }
            list = list.next;
        }

        return min;
    }
}
