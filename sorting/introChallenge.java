import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();

        int n = sc.nextInt(); 
        int[] ar = new int[n];
        for(int i=0; i<ar.length; i++){
            ar[i]=sc.nextInt();
            if(ar[i]==V)
                System.out.println(i);
        }
    }
}