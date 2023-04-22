package CH8_2D_Array;

import java.util.Scanner;
// saddle point means a element which is min in its own row and greater in column
public class saddle_point {
    public static void saddlePoint(int[][] arr){
        int n=arr.length;
        // claculate min in row
        for(int i=0;i<n;i++){
            int min=0;
            for(int j=1;j<arr[0].length;j++){
                if(arr[i][j]<arr[i][min]){
                    min=j;
                }
            }
            // calculate max in that row
            boolean flag =true;
            for(int k=0;k<n;k++){
                if(arr[k][min]>arr[i][min]){
                    flag=false;
                    break;
                }
            }

            if(flag==true){
                System.out.println(arr[i][min]);
                return;
            }
        }

        System.out.println("invalid input ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        saddlePoint(arr);
    }
}
