package CH6_Basics_Sorting;

import java.util.Scanner;

public class sort_in_lexicographical_order {
    public static void sortFruit(String[] arr){
        int n=arr.length;
        for(int i=0;i< arr.length;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j].compareTo(arr[min_index])<0){
                    min_index=j;
                }
            }
            String  temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
        for( String val :arr){
            System.out.print(val +" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String arr[]=new String[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.next();
        }
        sortFruit(arr);
    }
}
