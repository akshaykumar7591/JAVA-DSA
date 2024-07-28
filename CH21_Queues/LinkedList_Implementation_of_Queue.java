package CH_21_Queues;

public class LinkedList_Implementation_of_Queue {
    public static class Node{
       int val;
       Node next;
       public Node(int val){
           this.val= val;
       }
    }
    public static class QueueLL{
        Node head=null;
        Node tail=null;
        int size=0;

        public void add(int x){
            Node temp=new Node(x);
            if(head==null){
                head=tail=temp;
            }
            else {
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int remove(){
            if(head==null){
                System.out.println("Queue is empty");
                return -1;
            }
            int temp=head.val;
            head=head.next;
            size--;
            return temp;
        }

        public int peek(){
            if(head==null){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.val);
                temp=temp.next;
            }
            System.out.println();
        }
        public boolean isEmpty(){
            if(head==null){
                return true;
            }
            return  false;
        }


    }
    public static void main(String[] args) {
        QueueLL qll=new QueueLL();
        qll.add(1);
        qll.add(2);
        qll.add(3);
        qll.add(4);
        qll.remove();
        qll.display();
        System.out.println(qll.size);
    }
}
