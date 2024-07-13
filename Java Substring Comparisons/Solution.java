import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int n = s.length();
        String[] substrings = new String[n - k + 1];

        for(int i = 0; i <= n - k; i++) {
            substrings[i] = s.substring(i, i + k);
        }

        java.util.Arrays.sort(substrings);

        smallest = substrings[0];
        largest = substrings[substrings.length - 1];
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}