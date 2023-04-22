package CH5_Arrays;

import java.util.Scanner;
class ArraysExample3{
     int  findEleOfArray(int arr[],int num){
        int index=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return index;

    }
}

public class findElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter "+size+"of element : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        ArraysExample3 obj=new ArraysExample3();
        System.out.println("emter element which found : ");
        int num=sc.nextInt();
        System.out.println(obj.findEleOfArray(arr,num));
    }
}
