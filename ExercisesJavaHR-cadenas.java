import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class JavaStringsExercises {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("These are hackerRank's Java exercises - Strings");
        System.out.println(" --------------------------------------- ");
        // You can prove any function releated with every exercise en hackerRank.com below
        anagrama();
    }   

    // 1 - Java strings introduction

    public static void javaStringIntroduction(){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length());
        int compareTo = A.compareTo(B);
        if (compareTo > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        System.out.println((A.substring(0,1).toUpperCase() + A.substring(1)) + " " + B.substring(0,1).toUpperCase() + B.substring(1) );
    }

    // 2 - Java substrings

    public static void getSubstring(){
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        String substring = S.substring(start, end);
        System.out.println(substring);
    }

    // 3 - Java substring comparisons

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        // 0, 3 -> 0++, 3++ in every cicle.
        
        for (int i = 1; i <= s.length() - k; i++){
            // Save ministrings in every cicle. first -> 1,4; second-> 2,5...
            String temporalString = s.substring(i, i + k);
            // Comparison between the last 3char string save in latest cicle
            if (temporalString.compareTo(smallest) < 0){
                smallest = temporalString;
            } else if(temporalString.compareTo(largest) > 0) {
                largest = temporalString;
            }
        }

        return smallest + "\n" + largest;
    }

    // Insert this code in main to evaluate the function above
    /*
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    */

    // 4 - String reverse

    public static void reverseString(){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reverseA = "";
        
        for (int i = 0; i < A.length(); i++){
            char everyCharacter = A.charAt(i);
            reverseA = everyCharacter + reverseA; 
        }
        
        
        if (reverseA.equals(A)){
            System.out.println("Yes");
        } else  {
            System.out.println("No");
        }
    }

    // 5 - Anagrama

    public static boolean anagrama(){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String aLowercase = a.toLowerCase();
        String bLowercase = b.toLowerCase();
        
        // Conditional if lenght of each string is different.
        if (aLowercase.length() != bLowercase.length()){
            return false;
        }
        
        int count[] = new int[256];
        
        // Both strings lenghts are equal, so we use just one for cycle.
        // and count the number of ocurrency of each char inside strings.
        for (int i = 0; i < aLowercase.length(); i++) {
            count[aLowercase.charAt(i)]++;
            count[bLowercase.charAt(i)]--;
        }
        
        
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        
        return true;

    }
    
}
