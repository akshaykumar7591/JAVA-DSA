package CH11_Linear_Search;

import java.util.Scanner;

public class Search_in_range {
    public static void searchInRange(int arr[],int st,int end,int d){
        for(int i=st;i<=end;i++){
            if(arr[i]==d){
                System.out.println("present in range ");
                return;
            }
        }
        System.out.println("not found ");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int st=sc.nextInt();
        int end=sc.nextInt();
        int d= sc.nextInt();


        searchInRange(arr,st,end,d);
    }
}
