package CH_18_Linked_List;

public class intersection_of_two_Iinked_list {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
  static Node getIntersectonNode(Node headA,Node headB){
        Node tempA=headA;
        Node tempB=headB;
        int lengthA=0;
        while (tempA!=null){
            lengthA++;
            tempA=tempA.next;
        }
      int lengthB=0;
      while (tempB!=null){
          lengthB++;
          tempB=tempB.next;
      }
      tempB=headB;
      tempA=headA;
      if(lengthA>lengthB){
          int steps=lengthA-lengthB;
          for(int i=1;i<=steps;i++){
              tempA=tempA.next;
          }
      }
      else {
          int steps=lengthB-lengthA;
          for(int i=1;i<=steps;i++){
              tempB=tempB.next;
          }
      }
      while(tempA!=tempB){
          tempA=tempA.next;
          tempB=tempB.next;
      }
      return tempA;
  }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node a1 = new Node(11);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node b1 = new Node(22);
        Node c1 = new Node(20);
        Node d1 = new Node(23);


        b1.next = d;

        Node ans=getIntersectonNode(a,b1);
        System.out.println(ans.data);
    }
}
