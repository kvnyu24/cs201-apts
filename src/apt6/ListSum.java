package apt6;
import apt6.ListNode;
import java.util.*;

public class ListSum {
    public int sum(ListNode list, int thresh) {
        int sum = 0;
        while(list != null) {
            if (list.info > thresh) {
                sum += list.info;
            }
            list = list.next;
        }        
        return sum;
    }
}
