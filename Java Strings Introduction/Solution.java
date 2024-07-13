import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(a.length()+b.length());
        if (a.compareTo(b)>0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println(a.toUpperCase().charAt(0)+a.substring(1)+" "+b.toUpperCase().charAt(0)+b.substring(1));
        
    }
}



