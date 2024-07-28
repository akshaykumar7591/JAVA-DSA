package CH_18_Linked_List;

public class reverse_LL_IN_Iteratively {
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
    static void display(Node head){
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.data+" ");
             temp=temp.next;
         }
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node ans=reverse(a);
        display(ans);
    }
}
