package com.xiaozh.leetcode;

import com.xiaozh.function.ListNode;

public class Solution {
    private ListNode meetingNode(ListNode head){
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast && fast != null){
            slow = slow.next;
            fast = fast.next;
            if(fast != null){
                fast = fast.next;
            } else{
                return null;
            }
        }
        return fast;
    }
    public ListNode detectCycle(ListNode head, int pos) {
        ListNode meetingNode = meetingNode(head);
        if(meetingNode == null){
            return null;
        }
        ListNode node = meetingNode;
        int len = 1;
        while(node.next!=meetingNode){
            node = node.next;
            len++;
        }

        ListNode p1 = head;
        ListNode p2 = head;
        for(int i = 0; i<len; i++){
            p2 = p2.next;
        }
        while(p2!=null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
