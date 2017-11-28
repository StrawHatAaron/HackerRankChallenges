import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int uInput = scan.nextInt(); 
      scan.close();
      String ans="";
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(uInput%2==1)
         ans = "Weird";
      else if(uInput >= 2 && uInput <= 5 && uInput % 2 == 0)
         ans = "Not Weird";
      else if(uInput >= 6 && uInput <= 20 && uInput % 2 == 0)
         ans = "Weird";
      else if (uInput >= 20 && uInput % 2 == 0)
         ans = "Not Weird";
      
      System.out.println(ans);
   }
}
