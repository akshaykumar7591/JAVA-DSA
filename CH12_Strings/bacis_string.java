package CH12_Strings;

import java.util.Scanner;

public class bacis_string {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //String str=sc.next(); // after space not printing
        //System.out.println(str);

        String str=sc.nextLine();
        System.out.println(str);
        //functionin strings
        // length();-
        System.out.println(str.length());
        //charAt(index);-
        System.out.println(str.charAt(2));
        // indexOf(char);-
        System.out.println(str.indexOf('k'));
        // compareTo();
        String str1=sc.nextLine();
        System.out.println(str.compareTo(str1)); // giving str1-str value
        //contains(string/char);-
        System.out.println(str.contains("aks"));
        // startsWith();-
        System.out.println(str.startsWith("aks"));
        //endsWith();-
        System.out.println(str.endsWith("mar"));
        //toUpperCase();
        System.out.println(str.toUpperCase());
        //toLowerCase();-
        System.out.println(str.toLowerCase());
        //concat();-
        System.out.println(str.concat(str1));
        //substring(i,j)/substring(i);-
        System.out.println(str.substring(0,3));//3 not included
        System.out.println(str.substring(0));// start with 0

    // equals();-
        System.out.println(str.equals(str1));// first it will check address and then it check char by char
        System.out.println(str1.toCharArray());
        String[] arrOfStr = str.split("a", 2);

        for (String a : arrOfStr)
            System.out.println(a);
        //System.out.println(str1.split("@",3));



    }
}
