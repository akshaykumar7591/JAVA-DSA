package CH5_Arrays;
import java.util.Scanner;

public class Rotate_array {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[],int l,int h){
        while(l<h){
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;
        }
    }
    public static void rotate(int arr[],int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        rotate(arr,k);
        print(arr);
    }
}
