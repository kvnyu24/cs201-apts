package apt7;
import apt7.ListNode;
import java.util.*;

public class ListLastFirst {
    public ListNode move(ListNode list) {
        if (list==null || list.next==null) {
            return list;
        }
        ListNode last = this.lastNode(list);
        ListNode penul = this.penulNode(list);
        last.next = list;
        penul.next = null;

        return last;
    }

    public ListNode lastNode(ListNode list) {
        while (list != null && list.next != null) {
            list = list.next;
        }
        return list;
    }

    public ListNode penulNode(ListNode list) {
        while (list != null && list.next.next != null) {
            list = list.next;
        }
        return list;
    }
}
