package com.company.code;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        //comparing values and adding the smallest of the two into a dummy list
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                dummy.next = l1;
                l1 = l1.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }

        //if theres no more values in the list just continue and append the last values to the rest of
        // the new list im making
        if(l1 != null){
            dummy.next = l1;
        } else {
            dummy.next = l2;
        }
        return head.next;
    }
}
