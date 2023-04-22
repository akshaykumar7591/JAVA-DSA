package CH5_Arrays;

import java.util.Scanner;

public class Buy_And_Sell_Stocks {
    public static int BuyAndSell(int arr[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>buyprice){
                int profit=arr[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=arr[i];
            }
        }



        return maxprofit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("max profit is : "+BuyAndSell(arr));
    }
}
