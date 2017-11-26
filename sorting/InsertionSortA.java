import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSortA {
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        int sort = ar[ar.length-1];
        for(int i=ar.length-1; i>0; i--){
            if(ar[i-1]>sort){
            	ar[i]=ar[i-1];
            	printArray(ar);
            	if(i==1){
            		ar[i-1]=sort;
            		printArray(ar);
            	}
            }
            else if(ar[i-1]<sort){
            	ar[i]=sort;
            	printArray(ar);
            	return;
            }
        }
    }
    
	/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
}
