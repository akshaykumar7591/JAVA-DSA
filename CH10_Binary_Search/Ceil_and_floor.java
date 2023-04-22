package CH10_Binary_Search;
import java.util.Scanner;
// ceil -- higher >=target
// floor -- lower <=target

public class Ceil_and_floor {
    public static void ceilAndFloor(int[] arr,int n , int d){
        int st=0;
        int end=n-1;
        int ceil=0;
        int floor=0;
        if(d>arr[n-1]){
            System.out.println("not found");
            return ;
        }
        while(st<=end){
            int mid=st+(end-st)/2;
            if(d==arr[mid]){
                ceil=arr[mid];
                floor=arr[mid];
                break;
            }
            else if(d>arr[mid]){
                st=mid+1;
                floor=arr[mid];
            }
            else{
                end=mid-1;
                ceil=arr[mid];
            }
        }
        System.out.println(" the value of ceil is : "+ceil);
        System.out.println("the value of floor is : "+floor);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target : ");
        int d=sc.nextInt();
        ceilAndFloor(arr,n,d);
    }
}
