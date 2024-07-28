package CH_20_Stacks;

public class Linked_List_implementation_of_stacks {
     static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
        }
    static class  Stacksll{
        Node head=null;
        int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
                head=temp;
                size++;



        }
        void displayrr(Node temp){
            if(temp==null){
                return;
            }
            displayrr(temp.next);
            System.out.print(temp.val+" ");

        }
        void  display(){
            // this is print int reverse use helper displayrr
//            Node temp=head;
//            while(temp!=null){
//                System.out.print(temp.val+" ");
//                temp=temp.next;
//            }
            displayrr(head);
            System.out.println();

        }
        int pop(){
            if(head==null){
                System.out.println("empty");
                return -1;
            }
            Node temp=head;
            head=head.next;
            return temp.val;

        }
        int peek(){
            if(head==null){
                System.out.println("empty");
                return -1;
            }
            return head.val;
        }

        int size(){
            if(head==null){
                System.out.println("empty");
                return -1;
            }
            return size;
        }


    }
    public static void main(String[] args) {
        Stacksll st=new Stacksll();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());
        st.pop();
        st.display();


    }
}
