package CH8_2D_Array;

import java.util.Scanner;

public class wave_Transversl {
    public static void waveTraversal(int[][] arr,int n,int m){
        for(int j=0;j<m;j++){// for column
           if(j%2==0){
               for(int i=0;i<n;i++){ // for row in increasing order
                   System.out.print(arr[i][j]+" ");
               }
           }
           else{
               for(int i=n-1;i>=0;i--){ // for row in decreasing order
                   System.out.print(arr[i][j]+" ");
               }
           }
        }
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
        waveTraversal(arr,n,n);
    }
}
