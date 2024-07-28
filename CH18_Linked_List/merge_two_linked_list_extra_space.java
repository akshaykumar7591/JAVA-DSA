package CH_18_Linked_List;

public class merge_two_linked_list_extra_space {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    static Node mergeList(Node list1,Node list2){
        Node temp1=list1;
        Node temp2=list2;
        Node head =new Node(100);// extra node for starting
        Node temp=head;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                Node a=new Node(temp1.data);
                temp.next=a;
                temp=a;
                temp1=temp1.next;
            }
            else {
                    Node a=new Node(temp1.data);
                    temp.next=a;
                    temp=a;
                    temp2=temp2.next;
            }
        }
        if(temp1==null){
            temp.next=temp2;
        }
        else {
            temp.next=temp1;
        }
        return head.next;
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
//        f.next=c;
        Node a1 = new Node(7);
        Node b1 = new Node(8);
        Node c1 = new Node(9);
        Node d1 = new Node(10);
        Node e1 = new Node(11 );
        Node f1 = new Node(12);
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        d1.next = e1;
        e1.next=f1;
        Node ans=mergeList(a,a1);
        display(ans);
    }
}
