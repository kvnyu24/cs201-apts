import java.util.List;

import apt7.*;

public class Apt7 {
    public static void main(String[] args) throws Exception {
        // ListStretch
        // ListNode list = new ListNode(1, new ListNode(2, new ListNode(3)));
        // int amount = 3;

        // ListStretch ls = new ListStretch();
        // ListNode ret = ls.stretch(list, amount);
        // while (ret !=null) {
        //     System.out.println(ret.info);
        //     ret = ret.next;
        // }


        // DoubleList
        // ListNode list = new ListNode(1, new ListNode(2, new ListNode(3)));

        // DoubleList dl = new DoubleList();
        // ListNode ret = dl.bigify(list);

        // while (ret !=null) {
        //     System.out.println(ret.info);
        //     ret = ret.next;
        // }



        // ListLastFirst
        // ListNode list = new ListNode(1, new ListNode(2, new ListNode(3)));

        // ListLastFirst llf = new ListLastFirst();
        // ListNode ret = llf.move(list);
        // while (ret !=null) {
        //     System.out.println(ret.info);
        //     ret = ret.next;
        // }



        // RemoveMin
        // ListNode list = new ListNode(1, new ListNode(2, new ListNode(3)));

        // RemoveMin rm = new RemoveMin();
        // ListNode ret = rm.remove(list);
        // while (ret !=null) {
        //     System.out.println(ret.info);
        //     ret = ret.next;
        // }


        // SortedListRemoval
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(2, new ListNode(2, new ListNode(2))))));
        
        SortedListRemoval slr = new SortedListRemoval();
        ListNode ret = slr.uniqify(list);
        while (ret !=null) {
            System.out.println(ret.info);
            ret = ret.next;
        }

    }
    
}
