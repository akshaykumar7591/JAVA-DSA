package CH_Heap;

import java.util.ArrayList;
import java.util.List;

public class heapSort {
    public  static  void swap(List<Integer> heap, int i, int j){
        int temp=heap.get(i);
        heap.set(i,heap.get(j));
        heap.set(j,temp);
    }

    public static  void heapify(List<Integer> heap){
        int n=((heap.size()-1)-1)/2;
        int n1=heap.size()-1;
        for(int i=n;i>=0;i--){
            push_downMax(heap,i,n1);
        }
    }
    public static void heapSort(List<Integer> heap){
        heapify(heap);
        for (int i=heap.size()-1;i>0;i--){
            swap(heap,0,i);
            push_downMax(heap,0,i-1);
        }
    }
    public  static  void push_downMax(List<Integer> heap,int i,int n){
//        int n=heap.size()-1;
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
        push_downMax(heap,big,n);
    }
    public static void main(String[] args) {
        List<Integer> heap=new ArrayList<>();
        heap.add(10);
        heap.add(80);
        heap.add(70);
        heap.add(20);
        heap.add(10);
        heap.add(50);
        heap.add(90);

        System.out.println(heap);
        heapSort(heap);
        System.out.println(heap);
    }
}
