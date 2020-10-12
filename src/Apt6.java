import apt6.*;

public class Apt6 {
    public static void main(String[] args) throws Exception {
        // ListCount
        // ListNode list = new ListNode(1, new ListNode(2, new ListNode(3)));
        
        // ListCount lc = new ListCount();
        // System.out.println(lc.count(list));


        // ListSum
        // ListNode list = new ListNode(1, new ListNode(2, new ListNode(3)));
        // int thresh = 1;

        // ListSum ls = new ListSum();
        // System.out.println(ls.sum(list, thresh));


        // ListsEqual
        // ListNode a1 = null;
        // ListNode a2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        // ListsEqual le = new ListsEqual();
        // System.out.println(le.equal(a1, a2));


        // AlphaLength
        // String[] words = new String[] {"bat", "at", "spat", "expat"};

        // AlphaLength al = new AlphaLength();
        // ListNode ret = al.create(words);
        // while (ret !=null) {
        //     System.out.println(ret.info);
        //     ret = ret.next;
        // }


        // MergeLists
        ListNode a = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode b = new ListNode(1, new ListNode(2, new ListNode(3)));
        MergeLists ml = new MergeLists();
        ListNode ret = ml.weave(a, b);
        while (ret !=null) {
            System.out.println(ret.info);
            ret = ret.next;
        }

    }    
}
