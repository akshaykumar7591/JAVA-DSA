package CH5_Arrays;

import java.util.Scanner;
class Demoarray{
    void makingArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

public class declaration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        Demoarray obj=new Demoarray();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.makingArray(arr);

    }
}
