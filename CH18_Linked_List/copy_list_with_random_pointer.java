package CH_18_Linked_List;

import java.nio.file.NotLinkException;
import java.util.LinkedList;

public class copy_list_with_random_pointer {
     public static class Node{
         int data;
         Node next;
         Node random;
         Node(int data){
             this.data=data;
         }
     }
     public static Node copyRandom(Node head){
         Node head2=new Node(0);
         Node temp1=head;
         Node temp2=head2;
         // creating deep copy
         while(temp1!=null){
             Node t=new Node(temp1.data);
             temp2.next=t;
             temp2=t;
             temp1=temp1.next;
         }
         head2=head2.next;
         temp2=head2;
         temp1=head;
         // alternate connection
         Node temp=new Node(-1);
         while(temp1!=null){
             temp.next=temp1;
             temp1=temp1.next;
             temp=temp.next;

             temp.next=temp2;
             temp2=temp2.next;
             temp=temp.next;
         }
         temp1=head;
         temp2=head2;
         //asign random pointer
         while(temp1!=null){
             if(temp1.random==null){
                 temp2.random=null;
             }
             else if(temp2.random!=null){
                 temp2.random=temp.random.next;
             }
             temp1=temp2.next;
             if(temp1!=null){
                 temp2=temp1.next;
             }
         }
         temp1=head;
         temp2=head2;
         //separating the lists
         while(temp1!=null){
             temp1.next=temp2.next;
             temp1=temp1.next;
             if(temp1==null){
                 break;
             }
             temp2.next=temp1.next;
             if(temp2.next==null){
                 break;
             }
             temp2=temp2.next;
         }
         return head2;
     }

    public static void main(String[] args) {
       Node a=new Node(7);
        Node b=new Node(13);
        Node c=new Node(11);
        Node d=new Node(10);
        Node e=new Node(1);
        a.next=b;
        a.random=null;
        b.next=c;
        b.random=a;
        c.next=d;
        c.random=e;
        d.next=e;
        d.random=c;
        e.random=a;

        Node ans=copyRandom(a);

        while (ans!=null){
            System.out.print(ans.random+" ");
            ans=ans.next;
        }

    }




}
