package CH8_2D_Array;

import java.util.Scanner;

public class exit_point_of_Matrix {
    public static void exitPoint(int [][] arr){
        int direction=0;
        int i=0,j=0;
        while(true){
            direction=(direction+arr[i][j])%4;

            if(direction==0){//for east
                j++;
            }
           else if(direction==1){// for south
                i++;

            }
            else if(direction==2){// for west
                j--;
            }
            else if(direction==3){// for north
                i--;
            }
            // condition for break loop
            if(i<0){
                i++;
                break;
            }
            else if(j<0){
                j++;
                break;
            }
            else if(i== arr.length){
                i--;
                break;
            }
            else if(j==arr[0].length){
                j--;
                break;
            }

        }
        System.out.println(i+" "+j);
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
       exitPoint(arr);
    }
}
