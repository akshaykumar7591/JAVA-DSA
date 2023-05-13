package CH_18_Linked_List;

public class removing_nth_node {
    static class Node{
        int data;
       Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node nthNode(Node head, int idx){
        Node slow=head;
        Node fast= head;
        for(int i=0;i<idx;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }

   static void display (Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        a = nthNode(a, 1);
        display(a);
    }
}
