import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BFSS {

    //get the values unique nodes values entered                                                   number of nodes
    public static ArrayList<Integer> findUniqueNodes(ArrayList<Integer> u, ArrayList<Integer> v, int n){
        ArrayList<Integer> uniqueN = new ArrayList<Integer>();
        int count  = 0;
        for(Integer un: u){
            if(uniqueN.indexOf(un)==-1){
                uniqueN.add(un);
            }
        }
        for(Integer vn : v){
         if(uniqueN.indexOf(vn)==-1){
                uniqueN.add(vn);
            }       
        }
        return uniqueN;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        
        
        ArrayList<Integer> que = new ArrayList<Integer>();
        ArrayList<Integer> u = new ArrayList<Integer>();//from node
        ArrayList<Integer> v = new ArrayList<Integer>();//to node
        int n;//number of nodes
        int m;//number of edges
        for(int a0 = 0; a0 < q; a0++){
            n = in.nextInt();
            m = in.nextInt();
            boolean flag = (m+1<n)? false: true;//true if a node is left out???
            for(int a1 = 0; a1 < m; a1++){//describes what nodes are connected
                u.add(in.nextInt());
                v.add(in.nextInt());
                //System.out.println("u=" + u + "   v=" + v);
            }
            int s = in.nextInt();
            for(int i=0; i<n-m; i++){
                //if(i<m){
                if(i==0 && u.get(i)!=s)
                   que.add(-1);
                //}
                else
                    que.add(6);
            }

            ArrayList<Integer> uniqueN = findUniqueNodes(u, v, n);
            if(uniqueN.size()<n){
                int diff = n - uniqueN.size();
                for(int k = 0; k<diff; k++){
                    que.add(-1);
                }
            }

            while(!que.isEmpty())
                System.out.print(que.remove(0)+" ");
            System.out.println();
            
        }
        in.close();
    }
}
