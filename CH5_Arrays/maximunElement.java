package CH5_Arrays;

import java.util.Scanner;
class ArraysExample2{
    void maxOfArray(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
           if(max<arr[i]){
               max=arr[i];
           }
        }
        System.out.println(max);
    }
}

public class maximunElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter "+size+"of element : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        ArraysExample2 obj=new ArraysExample2();
        obj.maxOfArray(arr);
    }
}
