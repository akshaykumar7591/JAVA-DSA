package CH_18_Linked_List;

public class cycle_in_linked_list {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    static boolean cycleOrNot(Node head){
        if(head==null || head.next==null){
            return false;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null){
            if(slow==null){
                return false;
            }
            slow=slow.next;
            if(fast.next==null) {
                return false;
            }
            fast=fast.next.next;

            if(fast==slow){
                return true;
            }
        }
        return false;

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
        System.out.println(cycleOrNot(a));
    }
}
