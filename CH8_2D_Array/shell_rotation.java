package CH8_2D_Array;

import java.util.Scanner;

public class shell_rotation {
    public static void reverse(int[] arr1,int x,int j){
        while(x<j){
            int temp=arr1[x];
            arr1[x]=arr1[j];
            arr1[j]=temp;
            x++;
            j--;
        }
    }
    public static void rotate(int[] arr1,int r){
       r=r%arr1.length;
       if(r<0){
           r=r+arr1.length;
       }
       int n= arr1.length;
       reverse(arr1,0,n-r-1);
       reverse(arr1,n-r,n-1);
       reverse(arr1,0,n-1);
    }
    public static int[] fillArrFromShell(int [][]arr,int s){
        int minr=s-1;
        int minc=s-1;
        int maxr=arr.length-s;
        int maxc=arr.length-s;
        int size=2*(maxr-minr+maxc-minc);
        int arr1[]=new int[size];
        int idx=0;
        //left column
        for(int i=minr,j=minc;i<=maxr;i++){
            arr1[idx++]=arr[i][j];
        }
        // bottom row
        for(int i=maxr,j=minc+1;j<=maxc;j++){
            arr1[idx++]=arr[i][j];
        }
        // right column
        for(int i=maxr-1,j=maxc;i>=minr;i--){
            arr1[idx++]=arr[i][j];
        }
        // top row
        for(int i=maxr,j=maxc-1;j>=minc+1;j--){
            arr1[idx++]=arr[i][j];
        }
        return arr1;
    }
    public static void fillShellFromArr(int arr[][],int s,int []arr1){
        int minr=s-1;
        int minc=s-1;
        int maxr=arr.length-s;
        int maxc=arr.length-s;

        int idx=0;
        //left column
        for(int i=minr,j=minc;i<=maxr;i++){
            arr[i][j]=arr1[idx++];
        }
        // bottom row
        for(int i=maxr,j=minc+1;j<=maxc;j++){
            arr[i][j]=arr1[idx++];
        }
        // right column
        for(int i=maxr-1,j=maxc;i>=minr;i--){
            arr[i][j]=arr1[idx++];
        }
        // top row
        for(int i=maxr,j=maxc-1;j>=minc+1;j--){
            arr[i][j]=arr1[idx++];
        }

    }
    public static void shellRotation(int arr[][],int s,int r){
        int arr1[]=fillArrFromShell(arr,s);
        rotate(arr1,r);
        fillShellFromArr(arr,s,arr1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter shell number");
        int s=sc.nextInt();
        System.out.println("enter rotation ");
        int r=sc.nextInt();
       shellRotation(arr,s,r);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
