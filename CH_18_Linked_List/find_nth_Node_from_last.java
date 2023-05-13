package CH_18_Linked_List;

public class find_nth_Node_from_last {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node nthNode(Node head,int idx){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;

        }
        temp=head;
        int m=size-idx+1;
        for(int i=1;i<m;i++){
            temp=temp.next;
        }
        return temp;
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
        Node ans=nthNode(a,3);
        System.out.println(ans.data);
    }
}
