import java.io.*;
import java.util.*;

//checking to see if arrayLists work for this type of stuff
public class QuicksortA {
  private static void printArrayList(ArrayList<Integer> arl){
    for(Integer n: arl)
      System.out.print(n+" ");

    System.out.println();
  }

  //build an ArrayList of Integers from user input
  public static ArrayList<Integer> buildArrayListUI(){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();//this is the length of the list could have been more dynamic if we didnt have to specify
    ArrayList<Integer> arl = new ArrayList<Integer>();
    for(int i = 0; i < n; i++){
      arl.add(sc.nextInt());
    }   
    return arl;
  }

  public static ArrayList<Integer> Quicksort(ArrayList<Integer> ar){
    if(!ar.isEmpty()){
      int pivot = ar.get(0); 
      ArrayList<Integer> left = new ArrayList<Integer>();
      ArrayList<Integer> right = new ArrayList<Integer>() ;

      for(Integer i : ar){
        //insert into the left
        if (i<pivot)
          left.add(i);
        //insert into the right
        else if (i>pivot)
          right.add(i);
      } 
        left = Quicksort(left);
        right = Quicksort(right);  
        ArrayList<Integer> newAr = new ArrayList<Integer>();
        newAr.addAll(left);
        newAr.add(pivot);
        newAr.addAll(right);
      
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
      ArrayList<Integer> arl = buildArrayListUI();
      arl = Quicksort(arl);
      printArrayList(arl);
    }
}