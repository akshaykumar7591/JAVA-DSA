package CH_18_Linked_List;

import java.util.ServiceLoader;

public class find_node_where_cycle_start {
    static class Node{
        int data;
       Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    static Node cycleOrNot(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node slow=head;
       Node fast=head;
        while(fast!=null){
            if(slow==null){
                return null;
            }
            slow=slow.next;
            if(fast.next==null) {
                return null;
            }
            fast=fast.next.next;

            if(fast==slow){
               break;
            }
        }
       Node temp=head;
        while(temp!=slow){
            if(slow==null)return null;
            slow=slow.next;
            temp=temp.next;
        }
return temp;
    }
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4 );
        Node e = new Node(5);
        Node f = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next=f;
//        f.next=c;
        Node ans=cycleOrNot(a);
        if(ans==null){
            System.out.println("null");
            return;
        }
        System.out.println(ans.data);
    }
}
