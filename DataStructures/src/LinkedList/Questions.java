package LinkedList;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class Questions {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    //https://leetcode.com/submissions/detail/1126859524/
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;


        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    //https://leetcode.com/submissions/detail/1126856700/
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;

        while (node != null && node.next != null){
            if (node.val == node.next.val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }
        return head;
    }

    //https://leetcode.com/problems/linked-list-cycle/
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }

    //find length of the cycle
    public int lengthCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                //calculate the length
                ListNode temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }

    //https://leetcode.com/problems/linked-list-cycle-ii/
    public ListNode detectCycle(ListNode head) {
        int lengthOfCycle = lengthCycle(head);
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                lengthOfCycle = lengthCycle(slow);
                break;
            }
        }

        if (lengthOfCycle == 0){return null;}

        ListNode f = head;
        ListNode s = head;

        while (lengthOfCycle > 0){
            s = s.next;
            lengthOfCycle--;
        }

        while (f != s){
            f = f.next;
            s = s.next;
        }
        return f;
    }

    //https://leetcode.com/problems/happy-number/
    public boolean isHappyUsingSet(int n) {
        Set<Integer> set = new HashSet<Integer>();

        while (n != 1){
            if (set.contains(n)){
                return false;
            }else{
                set.add(n);
            }
            n = findSquare(n);
        }
        return true;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while (fast != slow);

        if (slow == 1){
            return true;
        }
        return false;
    }
    public int findSquare(int num){
        int ans = 0;
        while (num > 0){
            int remo = num % 10;
            ans = ans + (remo * remo);
            num = num / 10;
        }
        return ans;
    }

    //https://leetcode.com/problems/middle-of-the-linked-list/

    public ListNode middleNodeUsingOneIteration(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode middleNode(ListNode head) {
        int length = getLength(head);
        if (length == 0){return null;}
        ListNode ans = head;
        int till = 0;
        if (length % 2 == 0){
            length++;
        }
        for (int i = 1; i < length - (length/2); i++){
            ans = ans.next;
        }
        return ans;
    }
    public int getLength(ListNode head){
        if (head == null){
            return 0;
        }
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        return length;
    }


}
