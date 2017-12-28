import java.io.*;
import java.util.*;
import java.lang.*;

public class DayTen {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int remainder;
        int runningOnes = 0; 
        int biggestRunOnes = 0;
        do {
            remainder = n % 2;
            if(remainder == 1){
                runningOnes+=1;
                if(runningOnes>biggestRunOnes)
                    biggestRunOnes = runningOnes;
            }
            else{
                runningOnes = 0;
            }
        } while ((n /= 2) != 0);
        System.out.println(biggestRunOnes);
    }
}