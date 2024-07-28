package CH_Heap;

import java.util.ArrayList;
import java.util.List;

public class minHeap {
    public  static  void swap(List<Integer> heap,int i,int j){
        int temp=heap.get(i);
        heap.set(i,heap.get(j));
        heap.set(j,temp);
    }
    public  static  void push_Up(List<Integer> heap,int i){
        int parent=(i-1)/2;
        if(i==0 || heap.get(parent)>heap.get(i)){
            return;
        }
        swap(heap,i,parent);
        push_Up(heap,parent);
    }
    public static  void insertion_Min_Heap(List<Integer> heap,int ele){
        heap.add(ele);
        push_Up(heap,heap.size()-1);
    }
    public static void main(String[] args) {
        List<Integer> heap=new ArrayList<>();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);

        System.out.println(heap);
        insertion_Min_Heap(heap,40);
        System.out.println(heap);
    }
}
