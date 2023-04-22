package CH10_Binary_Search;
import java.util.Scanner;
public class find_smallest_greater_than_tatget {
    public static char nextgreater(char letter[],char target){
        int st=0;int end=letter.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(target<letter[mid]){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return letter[st%letter.length];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char letter[]=new char[n];
        for(int i=0;i<n;i++){
            letter[i]=sc.next().charAt(0);

        }
        char target=sc.next().charAt(0);
        System.out.println(nextgreater(letter,target));

    }
}
