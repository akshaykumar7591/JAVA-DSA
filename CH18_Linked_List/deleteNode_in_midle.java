package CH_18_Linked_List;



public class deleteNode_in_midle {
   static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
           this.next=null;
        }
    }
    static void display(Node head){
       Node temp=head;
       while(temp!=null){
           System.out.print(temp.data+" ");
           temp=temp.next;
       }
    }
     static void delelteNode(Node a) {
       a.data=a.next.data;
       a.next=a.next.next;

    }
    public static void main(String[] args) {
       Node a=new Node(1);
       Node b=new Node(2);
       Node  c=new Node(3);
       Node d=new Node(4);
       Node e=new Node(5);
       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;
       delelteNode(c);
       display(a);





    }


}
