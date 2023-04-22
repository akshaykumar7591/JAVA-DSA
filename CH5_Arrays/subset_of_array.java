package CH5_Arrays;

import java.util.Scanner;

public class subset_of_array {

public static void subset(int[] arr,int n){
    int limit =(int )Math.pow(2,n);
    for(int i=0;i<limit;i++){
        int temp=i;
        String ch=" ";
        for(int j=n-1;j>=0;j--){
            int r=temp%2;
            temp/=2;
            if(r==0){
                ch+=" ";

            }
            else{
                ch=arr[j]+" "+ch;
            }
        }
        System.out.println(ch);
    }
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of arr1 :");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("enter ele 1: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        subset(arr,n);

        }

}
