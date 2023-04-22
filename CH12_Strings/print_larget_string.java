package CH12_Strings;

public class print_larget_string {
    public static void main(String[] args) {
        String fruit[]={"apple","mango","bannana"};
                String str=fruit[0];
        for(int i=1;i<fruit.length;i++){
            if(str.compareTo(fruit[i])<0){
                str=fruit[i];
            }
        }
        System.out.println(str);
    }
}
