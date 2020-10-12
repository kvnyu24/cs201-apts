package apt6;
import apt6.ListNode;
import java.util.*;

public class ListsEqual {
    public int equal (ListNode a1, ListNode a2) {
        if (checkNull(a1, a2)) {
            return 0;
        }
        while (a1 != null && a2 != null) {
            if (a1.info != a2.info) {
                return 0;
            } 
            a1 = a1.next;
            a2 = a2.next;
            if (checkNull(a1, a2)) {
                return 0;
            }
        }
        return 1;
    }

    public boolean checkNull (ListNode a1, ListNode a2) {
        if (a1 == null && a2 != null) {
            return true;
        } else if (a2 == null && a1 != null) {
            return true;
        }
        return false;
    }
}
