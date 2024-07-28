package CH_19_Double_Linked_List;

public class isPalindriome_dll {
    static  class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

    }
    public static boolean ispalindrome(Node head){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        Node h=head;
        while (h!=temp){
            if(h.data!=temp.data){
                return  false;
            }
            h=h.next;
            temp=temp.prev;
        }
        return true;
    }
    public static void display (Node head){
       Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
       Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(2);
        Node d=new Node(1);
        a.next=b;
        a.prev=null;
        b.next=c;
        b.prev=a;
        c.next=d;
        c.prev=b;
        d.next=null;
        d.prev=c;
        System.out.println(ispalindrome(a));
    }
}
