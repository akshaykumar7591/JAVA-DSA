package CH_18_Linked_List;

public class delete_middle_element_in_linked_list {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }

    //  this is for odd and even left middle
    // this is because for delete right we need left middle

    static Node removeMiddle(Node head){
        if(head==null){
            return null;
        }
        Node slow=head;
        Node fast=head;
        // first find middle  left in case in even
        while (fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
         return head;
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
        display(a);
        a=removeMiddle(a);
     display(a);
    }
}
