package CH_21_Queues;

public class Array_Implementation_of_Queue {

    public static class QueueA {
        int f = -1;
        int r = -1;
        int arr[] = new int[4];
        int size = 0;

        //add
        public void add(int x) {
            if (r == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (f == -1) {
                f = r = 0;
                arr[0] = x;
            } else {
                arr[++r] = x;
            }
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            f++;
            size--;
            return arr[f - 1];
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
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
            } else {
                for (int i = f; i <=r; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }

        }
    }
    public static void main(String[] args) {
        QueueA q=new QueueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(2);
        q.remove();
        q.display();
        System.out.println(q.size);
    }
}
