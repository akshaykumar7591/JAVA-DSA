package CH_18_Linked_List;

public class find_nth_node_in_One_traversal {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node nthNode(Node head,int idx){
        Node slow=head;
        Node fast= head;
        for(int i=0;i<idx;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
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
