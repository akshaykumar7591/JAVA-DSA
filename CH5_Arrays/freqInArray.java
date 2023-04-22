package CH5_Arrays;

import java.util.Scanner;

public class freqInArray{
     static int[] EleexitOrNot(int arr[]){
         int freq[]=new int[1000005];
         for(int i=0;i<arr.length;i++){
             freq[arr[i]]++;
         }
         return freq;



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter "+size+"of element : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }


        int ans[]=EleexitOrNot(arr);
        int quiere;
        System.out.println("enter how many quier youu want : ");
        quiere=sc.nextInt();
        while(quiere>0){
            int x=sc.nextInt();
            if(ans[x]>0){
                System.out.println("found");
            }
            else{
                System.out.println("not found");
            }
            quiere--;
        }


    }


}

