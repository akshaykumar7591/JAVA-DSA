package CH_18_Linked_List;

public class find_middle_of_linked_list {
     static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    // this is for odd and even right middle
    public static Node getmiddleNode(Node head){
         Node slow=head;
         Node fast=head;
         while(fast!=null && fast.next!=null ){
             slow=slow.next;
             fast=fast.next.next;
         }
         return slow;
    }
  //  this is for odd and even left middle
  public static Node getmiddleNode1(Node head){
      Node slow=head;
      Node fast=head;
      while(fast.next!=null && fast.next.next!=null ){
          slow=slow.next;
          fast=fast.next.next;
      }
      return slow;
  }

    public static void main(String[] args) {
       Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4 );
        Node e = new Node(5);
//        Node f = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//        e.next=f;

        Node ans=getmiddleNode1(a);
        System.out.println(ans.data);
    }
}
