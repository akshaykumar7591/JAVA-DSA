package CH_20_Stacks;

import java.util.Arrays;

public class Array_implementation_of_Stacks {
     static class Stacks{
        int []arr=new int[4];
        int idx=0;
        void push(int x){
            if(isFull()){
                System.out.println("full");
            }
            // another way
            if(isFull()){
                int size=2*arr.length;
                int []newarr=new int[size];
//                newarr= Arrays.copyOf(arr,arr.length-1);
                int i;
                for(i=0;i<arr.length;i++){
                    newarr[i]=arr[i];
                }

                newarr[i]=x;
                arr=newarr;
                idx++;
            }
            else{
                arr[idx++]=x;
            }
        }
        int pop(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        int  peek(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            return arr[idx-1];
        }
        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            return false;
        }
        boolean isFull(){
            if (idx==arr.length)return true;
            return false;
        }
        public void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
    }

    public static void main(String[] args) {
        Stacks  st=new Stacks();
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
