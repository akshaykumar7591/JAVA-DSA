package CH5_Arrays;

import java.util.Scanner;

public class sumOfRange{
    static void prefixsum(int arr[]){
       for(int i=1;i<arr.length;i++){
           arr[i]=arr[i-1]+arr[i];
       }



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array :");
        int size=sc.nextInt();
        int arr[]=new int[size+1];
        System.out.println("enter "+size+" of element : ");
        for(int i=1;i<=size;i++){
            arr[i]=sc.nextInt();

        }
        prefixsum(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int q;
        System.out.println("enter queries ");
        q=sc.nextInt();
        while(q>0){
            int l,h;
            l=sc.nextInt();
            h=sc.nextInt();
            int ans=arr[h]-arr[l-1];
            System.out.println(ans);

            q--;
        }





    }


}

