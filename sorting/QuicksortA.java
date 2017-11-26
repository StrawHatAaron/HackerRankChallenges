import java.io.*;
import java.util.*;

public class QuicksortA {

    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }

	public static int[] buildArray(){
		  Scanner sc = new Scanner(System.in);
	   	int n = sc.nextInt();
    	int[] ar = new int[n];
    	for(int i=0; i<n; i++){
    		ar[i]=sc.nextInt();
    	}				 
    	return ar;
	}

	public static ArrayList<Integer> Quicksort(ArrayList<Integer> ar){
		int count = 0;
    if(!ar.isEmpty()){
      int pivot = ar.get(0); 
      ArrayList<Integer> left = new ArrayList<Integer>();
      ArrayList<Integer> right = new ArrayList<Integer>() ;

      for(Integer i : ar){
   //   for(int i = 0; i < ar.length; i++){
        //this is the pivot do nothing
        if(i==pivot){
          count++;
          System.out.println("pivot = " + i + "   count:" + count);
        }
        //insert into the left
        else if (i<pivot) {
          count++;
          left.add(i);
          System.out.println("left " + i + "   count:" + count);
        }
        //insert into the right
        else {
          count++;
          right.add(i);
          System.out.println("right " + i + "   count:" + count);
        }
      } 
        left = Quicksort(left);
        System.out.println("left = wtf");
        right = Quicksort(right);  
        System.out.println("right = wtf");
        ArrayList<Integer> newAr = new ArrayList<Integer>();
        newAr.addAll(left);
        newAr.add(pivot);
        newAr.addAll(right);
        count++; 
      
      return newAr; 
    }
    else{
        return ar;
    }
	}

    public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. 
    	Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
    	int ar[] = buildArray();//take user input and build the array
      ArrayList<Integer> arl = new ArrayList<Integer>();
      for(int i : ar)
        arl.add(i);

      ArrayList<Integer> cpl = Quicksort(arl);
      //all below can be deleted if a ArrayList will work on Hacker Rank
      
      int[] cp = new int[ar.length];
      int count = 0;
      for(Integer i : cpl){
        cp[count] = (int) i; 
        count++;
      }

      printArray(cp);
    }
}