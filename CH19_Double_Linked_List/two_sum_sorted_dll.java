package CH_19_Double_Linked_List;

import java.sql.SQLOutput;

public class two_sum_sorted_dll {

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
    public static boolean twoSum(Node head,int x){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        Node h=head;
//        System.out.println(h!=temp);
        while (h!=temp){
           if(h.data+temp.data==x){
               System.out.println(h.data+" "+temp.data);
               return true;
           }
           else if(h.data+temp.data<x){
               h=h.next;

           }
           else{
               temp=temp.prev;
           }
        }
        return false;
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
        boolean sum=twoSum(a,6);
        System.out.println(sum);
    }
}

