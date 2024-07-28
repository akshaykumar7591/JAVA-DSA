package CH_Heap;

import java.util.ArrayList;
import java.util.List;

public class deletionFromMaxHeap {
    public  static  void swap(List<Integer> heap, int i, int j){
        int temp=heap.get(i);
        heap.set(i,heap.get(j));
        heap.set(j,temp);
    }
    public  static  void push_down(List<Integer> heap,int i){
        int n=heap.size()-1;
        if(i==n  ){
            return;
        }
        int left=(2*i)+1;
        int right=(2*i)+2;
        int big=i;
        if(left<=n && heap.get(big)<heap.get(left)){
            big=left;
        }
        if(right<=n && heap.get(big)<heap.get(right)){
            big=right;
        }

        if(i==big  ){
            return;
        }

        swap(heap,i,big);
        push_down(heap,big);
    }
    public static  void deletion_Max_Heap(List<Integer> heap){
        swap(heap,0,heap.size()-1);
        heap.remove(heap.size()-1);
        push_down(heap,0);
    }
    public static void main(String[] args) {
        List<Integer> heap=new ArrayList<>();
        heap.add(90);
        heap.add(80);
        heap.add(70);
        heap.add(20);
        heap.add(10);
        heap.add(50);
        heap.add(60);

        System.out.println(heap);
        deletion_Max_Heap(heap);
        System.out.println(heap);
    }
}
