package CH_21_Queues;

public class Array_Implementation_of_Circular_Queue {
    public static class QueueA {
        int f = -1;
        int r = -1;
        int arr[] = new int[4];
        int size = 0;

        //add
        public void add(int x)throws Exception {
            if (size == arr.length) {
               throw new Exception("Queue is full");
            }
            if (size==0) {
                f = r = 0;
                arr[0] = x;
            }
            else if(r<arr.length-1) {
                arr[++r] = x;
            }
            else if(r==arr.length-1){
                r=0;
                arr[0]=x;
            }
            size++;
        }

        public int remove()throws Exception {
            if (size == 0) {
                throw new Exception("Queue is full");
            }
           else{
               int val=arr[f];
               if(f==arr.length-1){
                   f=0;
               }
               else{
                   f++;
               }
               size--;
               return val;
            }

        }

        public int peek()throws Exception {
            if (size == 0) {
                throw new Exception("Queue is full");
            }
            return arr[f];
        }

        public boolean isEmpty() {
            if (size == 0) {
                return true;
            }
            return false;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            else if(f<=r) {
                for (int i = f; i <=r; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            else{
                for (int i = f; i <arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <=r; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }

        }
    }
    public static void main(String[] args) {
        QueueA q=new QueueA();

        try{
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);

            q.remove();
            q.add(3);
            q.display();
            System.out.println(q.peek());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
