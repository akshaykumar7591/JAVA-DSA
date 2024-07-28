package CH_18_Linked_List;

public class remove_cycle {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void remove(Node head){


        Node slow=head;
        Node fast=head;
       boolean cycle=false;
       while (fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast){
               cycle=true;
               break;
           }
        }
       if (cycle==false){
           return ;
       }
       slow=head;
       Node prev=null;
       while (slow!=fast){
           prev=fast;
           slow=slow.next;
           fast=fast.next;
       }
       prev.next=null;

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
        f.next=c;
        remove(a);

        while (a!=null){
            System.out.print(a.data+" ");
            a=a.next;
        }

    }
}
