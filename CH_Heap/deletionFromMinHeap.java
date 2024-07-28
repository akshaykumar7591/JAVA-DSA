package CH_Heap;

import java.util.ArrayList;
import java.util.List;

public class deletionFromMinHeap {
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
        int small=i;
        if(left<=n && heap.get(small)>heap.get(left)){
            small=left;
        }
        if(right<=n && heap.get(small)>heap.get(right)){
            small=right;
        }

        if(i==small  ){
            return;
        }

        swap(heap,i,small);
        push_down(heap,small);
    }
    public static  void deletion_Min_Heap(List<Integer> heap){
       swap(heap,0,heap.size()-1);
       heap.remove(heap.size()-1);
        push_down(heap,0);
    }
    public static void main(String[] args) {
        List<Integer> heap=new ArrayList<>();
        heap.add(5);
        heap.add(20);
        heap.add(10);
        heap.add(40);
        heap.add(50);
        heap.add(30);
        heap.add(60);

        System.out.println(heap);
        deletion_Min_Heap(heap);
        System.out.println(heap);
    }
}
