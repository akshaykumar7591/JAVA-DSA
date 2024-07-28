package CH_18_Linked_List;

public class Implementation_of_linked_list {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class linkList {
        Node head = null;
        Node tail = null;
        int size=0;

        // insert at end
       void insertAtEnd(int val){
           Node temp=new Node(val);
           size++;
           if(head==null){
               head=temp;
               tail=temp;

           }
           else{
               tail.next=temp;
               tail=temp;
           }
       }

        // display
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        // size  now it not use because i make new size gollbly

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        // insert at head
        void insertAtHead(int val) {
            Node temp = new Node(val);
            size++;
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        //insert at given index
        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size()) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtHead(val);
                return;
            } else if (idx < 0 || idx > size()) {
                System.out.println("wrong index");
                return;
            }
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            size++;
            t.next = temp.next;
            temp.next = t;
        }

        // get element at any give index
        int getAt(int idx) {
            if (idx < 0 || idx > size()) {
                System.out.println("wrong index");
                return -1;
            }
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // insert at end with tail pointer
        public static void insertAtEnd(Node head, int val) {
            Node temp = new Node(val);
            Node t = head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = temp;
        }
        int deleteAtFirst(){
           Node temp=head;
           head=head.next;
           size--;
           return temp.data;

        }
        int deleteAtLast(){
           Node temp=head;
           for(int i=0;i<size-2;i++){
               temp=temp.next;
           }
           int val=temp.next.data;
           temp.next=null;
           tail=temp;
           size--;
           return val;
        }
        void deleteAtIndex(int idx){
           Node temp=head;
           if(idx==0){
               head=head.next;
               size--;
               return;
           }
           if (idx==size){
               deleteAtFirst();
               return;
           }
           for (int i=0;i<idx-1;i++){
               temp=temp.next;
           }
           temp.next=temp.next.next;
           size--;


        }

    }



    public static void main(String[] args) {
       linkList list=new linkList();
       list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(66);
//        list.display();
        list.insertAtHead(10);
        list.insertAt(2,99);
        list.insertAtEnd(55);
        list.display();
        System.out.println();
        System.out.println(list.size());
        System.out.println(list.getAt(3));

//        System.out.println(list.deleteAtFirst());
//        list.display();
//        System.out.println(list.size);
        System.out.println(list.deleteAtLast());
        list.deleteAtIndex(2);
        list.display();
        System.out.println();
        System.out.println(list.size);

    }
}
