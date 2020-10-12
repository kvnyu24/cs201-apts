public ListNode duplicate(ListNode list) {
    ListNode last = last(list);
    ListNode copy = copy(list);
    last.next = copy;

    return list;
}


EXPRESSION_ONE: ListNode first = new ListNode(s.charAt(0)-'0');
EXPRESSION_TWO: last.next = new ListNode(s.charAt(0)-'0');
EXPRESSION_THREE: last = last.next; 

VALUE_1 = list.next
VALUE_2 = null
VALUE_3 = first
