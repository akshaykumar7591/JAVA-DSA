package CH_18_Linked_List;

public class odd_even_Linked_List {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node oddEven(Node head){
        Node odd=new Node(0);
        Node even=new Node(0);

        Node tempo=odd;
        Node tempe=even;
        Node temp=head;
        while (temp!=null){
            tempo.next=temp;
            temp=temp.next;
            tempo=tempo.next;
            tempe.next=temp;
            if (temp==null){
                break;
            }
            temp=temp.next;
            tempe=tempe.next;
        }
        odd=odd.next;
        even=even.next;
        tempo.next=even;
        return odd;

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
        Node ans=oddEven(a);

        while (ans!=null){
            System.out.print(ans.data+" ");
            ans=ans.next;
        }

    }
}
