package CH_18_Linked_List;

import javax.management.NotificationEmitter;

public class Palindrome_LL {
    static class Node{

        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node after=null;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
    static boolean isPalindrome(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node prev=reverse(slow.next);
        slow.next=prev;
        Node p1=head;
        Node p2=slow.next;

        while(p2!=null){
            if(p1.data!=p2.data){
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
       Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(2);
        Node e=new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(isPalindrome(a));
    }
}
