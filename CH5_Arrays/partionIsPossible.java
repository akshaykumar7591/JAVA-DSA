package CH5_Arrays;

import java.util.Scanner;

public class partionIsPossible{
    static int sumOfArray(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static boolean prefixsum(int arr[]){
        int totalsum=sumOfArray(arr);
        System.out.println(totalsum);
        int prefix=0;
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            int suffix=totalsum-prefix;
            if(prefix==suffix){
                return true;
            }
        }
        return false;



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter "+size+" of element : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        boolean ans= prefixsum(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(ans);





    }


}

