package CH_18_Linked_List;

public class Zig_zag_Linked_list {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void zigZag(Node head){
       Node slow=head;
       Node fast=head;
       // find mid
       while (fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
       Node mid=slow;
       //reverse 2nd half
       Node curr=mid.next;
       mid.next=null;
       Node prev=null;
       Node next;
       while(curr!=null){
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;

       }
       Node left=head;
       Node right=prev;

       Node nextl,nextr;
       // alt merge zig zag merge
        while(left!=null && right!=null){
            nextl=left.next;
            left.next=right;
            nextr=right.next;
            right.next=nextl;

            left=nextl;
            right=nextr;
        }

    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(23);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
       zigZag(a);

        while (a!=null){
            System.out.print(a.data+" ");
            a=a.next;
        }

    }
}
