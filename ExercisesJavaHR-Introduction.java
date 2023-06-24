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

class MainExercisesHackerRank {

    public static void main(String[] args) throws IOException{
        System.out.println("Hello World!");
        System.out.println("These are hackerRank's Java exercises");
        System.out.println(" --------------------------------------- ");
        // You can prove any function releated with every exercise en hackerRank.com below

        
    }

    // 1 - Welcome yo Java. A simple stdout

    // 2 - Java STDIN and STDOUT

    public static void stdin(){
        Scanner variableScanner = new Scanner(System.in);
        System.out.println("Insert 3 randoms numbers");
        int numberOne = variableScanner.nextInt();
        int numberTwo = variableScanner.nextInt();
        int numberThree = variableScanner.nextInt();

        variableScanner.close();

        System.out.println("These are your numbers ");
        System.out.println("Number one: " + numberOne);
        System.out.println("Number two: " + numberTwo);
        System.out.println("Number three: " + numberThree);
    }


    // 2 - Java If-Else

    public static void siYsino(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 != 0 ){
            System.out.println("Weird");
        } else if (N >= 2 && N <= 5){
            System.out.println("Not Weird");
        } else if (N >= 6 && N <= 20){
            System.out.println("Weird");
        } else if (N >= 20) {
            System.out.println("Not Weird");
        }
        scanner.close();
    }

    // 3 - Java Output Formatting | System.out.printf w/ integers and strings

    public static void formatingStringNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-14s %03d %n", s1, x);
        }
        System.out.println("================================");
    }

    // 4 - Java Loops I
    // Given an integer, N , print its first 10 multiples.
    // Each multiple Nxi (where 1 <= i <= 10) should be printed on a new line in the form: N x i = result.

    public static void usingLoopFor() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int result = 0;
        for (int i = 1; i <= 10; i++){
            result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }
        bufferedReader.close();
    }

    // 5 - Java Loops II
    // (a + 2^0 x b) ... (a + 2^0 x b + 2^1 x b + ... + 2^n-1 x b)
    public static void javaloopDos(){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t && (t <= 500 && t >= 0);i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = 0;
            int saveNumber = 0;
            // a + 2^n x b

            if (a >= 0 && b >= 0 && a <= 50 && b <= 50){
                for (int nIndex = 0; nIndex < n && n <= 15 && n >= 0; nIndex++){
                    saveNumber = saveNumber + ((int)Math.pow(2, nIndex) * b);
                    result = a + saveNumber;
                    System.out.print(result + " ");
                }
            }
            System.out.printf("%n");
        }
        in.close();
    }

    // 6 - Java Stdin and Stdout II
    // Sample Input :
        // 42
        // 3.1415
        // Welcome to HackerRank's Java tutorials!

    // Expected Output :
        // String: Welcome to HackerRank's Java tutorials!
        // Double: 3.1415
        // Int: 42

    public static void javastdinDos(){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();

        scan.nextLine();
        String s = scan.nextLine();

        scan.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }

    // 7 - Java DataTypes
    // Java have 8 primitives data types -> char, boolean, byte, short, int, ling, float and double.
    // In this exercise we'll work with the primitive types used to hold integer values ->
    // BYTE : 8-bit signed int  ; SHORT : 32-BIT signed int ; INT : a 32-bit signed int ; LONG: 64-bit signed int.

    public static void dataTypes(){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }

    // 9 - End of File in Java.

    public static void endofFile(){
        Scanner file = new Scanner(System.in); // give the current file
        int currentLine = 1;

        while(file.hasNext()){
            String input = file.nextLine();
            System.out.println(currentLine + " " + input);

            currentLine++;
        }
    }

    // 10 - Java static initializer block

    public static void areaparalelogramoInicializar(){
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        try {
            if(b > 0 && h > 0) {
                System.out.println(b * h);
            } else {
                h = b / 0;
                System.out.println(h);
            }

        } catch (Exception e){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    // 11 - Int to String

    public static void inttoString(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = Integer.toString(n);
        try {
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
               } else {
                System.out.println("Wrong answer.");
               }
        } catch (DoNotTerminate.ExitTrappedException e){
            System.out.println("Unsuccessful Termination!!");
        }
    }

    // 12 - Get day of a date in calendar
    // function getDay(month, day, year)

    public static String findDay(int month, int day, int year){
        Calendar newCalendar = Calendar.getInstance();
        newCalendar.set(year, month-1, day);
        DateFormat dateDay = new SimpleDateFormat("EEEE");

        return dateDay.format(newCalendar.getTime()).toUpperCase();
    }

    // 13 - Java currency formatter

    public static void currencyFormatter(){
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        
        // US
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        System.out.println("US: " + us);
        // India
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        System.out.println("India: " + india);
        //China
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        System.out.println("China: " + china);
        // France
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        System.out.println("France: " + france);
    }

    // Strings in Java 
    // Java String Tokens

    public static void gettingString() {
        Scanner scan = new Scanner(System.in);
        String scannerOriginal = scan.nextLine();
        // TRIM method delete all blank spaces before the first word!
        String s = scannerOriginal.trim();
        // Write your code here.
        // English Alphabetic LETTERS, BLANK SPACES, EXCLAMATION (!), COMMAS (,)
        // QUESTION MARKS (?), PERIODS (.), UNDERSCORES (_), APOSTROPHES ('), AND AT SYMBOLS (@)
        List<String> symbols = new ArrayList<>(Arrays.asList(" ", "?", "@", "!", "'", ",", "_", "."));
        List<String> outputString = new ArrayList<>();

        char previousChar = '\0';
        String[] words = s.replaceAll("[^a-zA-Z0-9]", " ").split("\\s+");


        int countingWords = 0;


        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if ( (symbols.contains(String.valueOf(s.charAt(i)))) && (Character.isLetter(previousChar))) {
                countingWords++;
            }

            previousChar = currentChar;
            
        } 

        if (Character.isLetter(previousChar)) {
            countingWords++;
        }

        // well.. this code explain WHY A IM A FUCK PELOTUDO DIOSSSSSSSSSSSSSSSS!!! POR NO SABER EXPRESIONES REGULARES
        // THIS -> String[] words = s.replaceAll("[^a-zA-Z0-9']", " ").split("\\s+"); THAT FUCKING APOSTROFE after the '9'. JUST DELETE THAT

        // for (int i = 0; i < words.length; i++) {
        //     String word = words[i];
        //     if (word.contains("'")) {
        //         String[] subWords = word.split("'");
        //         for (String subWord : subWords) {
        //             if (!subWord.equals("")) {
        //                 outputString.add(subWord);
        //             }
        //         }
        //     } else {
        //         outputString.add(word);
        //     }
        // }

        for (String word : words) {
            outputString.add(word);
        }
        
        scan.close();
        System.out.println(countingWords);
        for (String word : outputString) {
            System.out.println(word);
        }

    }


    // REGEX patter parentheses 
    // THIS COULD BE VEEEEEEEEEERY IMPORTANT FOR MERCADOLIBRES'S INTERVIEW !!! LOOK WARNING!!

    public static void regexPatternParentheses(){
        Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0 && in.hasNextLine()){
			String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
		}
    }

}

// Class for IP validation

class MyRegex {
    
    String pattern = "^(([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d{1,2}|2[0-4]\\d|25[0-5])$";
    Pattern patterIp = Pattern.compile(pattern);
    
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {

     private static final long serialVersionUID = 1;
    }

    public static void forbidExit() {
     final SecurityManager securityManager = new SecurityManager() {
      @Override
      public void checkPermission(Permission permission) {
       if (permission.getName().contains("exitVM")) {
        throw new ExitTrappedException();
       }
      }
     };
     System.setSecurityManager(securityManager);
    }
}


// Solution class for CalendarDate exercise
/*
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
 */



