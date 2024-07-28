package CH_19_Double_Linked_List;

import CH_18_Linked_List.Zig_zag_Linked_list;

public class implementation {
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
         static void insetAtHead(Node head,int x){
            Node t=new Node(x);
            t.next=head;
            head.prev=t;
            head=t;


        }
         public static void insetAtEnd(Node head,int x){
             Node temp=head;
             while(temp.next!=null){
                 temp=temp.next;
             }
             Node t=new Node(x);
             temp.next=t;
             t.prev=temp;
         }
         // insert at any index

         public static void insertAtInd(Node head,int idx,int x){
            Node s=head;
            for(int i=1;i<=idx-1;i++){
                s=s.next;
            }
            Node r=s.next;
            Node t=new Node(x);
            s.next=t;
            t.prev=s;
            t.next=r;
            r.prev=t;
         }
         public static void reverse(Node head){
            Node curr=head;
            Node prev=null;
            Node next1;
            while(curr!=null){
                next1=curr.next;
                curr.next=prev;
                curr.prev=next1;
                prev=curr;
                curr=next1;

            }
            head=prev;
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
        Node c=new Node(3);
        Node d=new Node(4);
        a.next=b;
        a.prev=null;
        b.next=c;
        b.prev=a;
        c.next=d;
        c.prev=b;
        d.next=null;
        d.prev=c;
        insertAtInd(a,2,5);
        insetAtEnd(a,33);
        display(a);




    }
}
