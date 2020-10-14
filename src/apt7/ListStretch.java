// package apt7;
// import apt7.ListNode;
import java.util.*;

public class ListStretch {
    public ListNode stretch (ListNode list, int amount){
        ListNode last = list;

        while(last != null) {
            ListNode next = last.next;
            for (int i=0; i<amount-1; i++) {
                last.next = new ListNode(last.info);
                last = last.next;    
            }
            last.next = next;
            last = last.next;    
        }
        return list;
    }
}
