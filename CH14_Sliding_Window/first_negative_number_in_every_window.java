package CH14_Sliding_Window;

import java.util.ArrayList;
import java.util.Scanner;

public class first_negative_number_in_every_window {
    public static void negativeprint(int[] arr,int k){
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        while(j<n){
            if(arr[j]<0){ // element is smaller than 0 then add in list
                list.add(arr[j]);
            }

            if(j-i+1<k){ // increase j+++ for equal to sunarray length
                j++;
            }
            else if(j-i+1==k){  // length is equal
                if(list.size()==0){ // size is zero than print 0 mean no element present
                    System.out.print(0+" ");
                }
               else{
                    System.out.print(list.get(0)+" "); // else print first element of list becouse that is first negative no
                    if(  arr[i]==list.get(0)){ // if we increase i then check both element are equal then
                        list.remove(0);//delete
                    }
                }

                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("size of subarray");
        int k=sc.nextInt();
        negativeprint(arr,k);
    }
}
