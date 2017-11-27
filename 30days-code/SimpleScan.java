import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class SimpleScan{

public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner scan = new Scanner(System.in);
        //had to use a scanner for the string for some reason java didn't allow me to use the same one
        //oh well type saftey can be a plus
        Scanner strScan = new Scanner(System.in);
 /* Declare second integer, double, and String variables. */
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        i += scan.nextInt();
        d += scan.nextDouble();
        s += strScan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        /* Print the sum of the double variables on a new line. */
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
//        int sum = i + (int) d;
        System.out.println(i);
        System.out.println(d);
        System.out.println(s);
         scan.close();
         strScan.close();
    } 
}
