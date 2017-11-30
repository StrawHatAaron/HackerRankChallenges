import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static ArrayList<Integer>[] adjCities;
    private static int connectedComponents;
    private static boolean[] visited;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt(); // number of queries
        for(int a0 = 0; a0 < q; a0++){
            int cities = in.nextInt(); // number of cities
            int roads = in.nextInt(); // number of roads
            int libCost = in.nextInt(); // cost of building a library
            int roadCost = in.nextInt(); // cost of repairing a road

            if (roadCost >= libCost || roads == 0){ 
                // optimal scenario/edge (corner) case + a for loop to get correct nextInts
                System.out.println(libCost * cities);
                for (int i = 0; i < (roads*2); i++){
                    in.nextInt();
                }
                continue;
            }
            
            
            else{
                //Now we must try to get all the connected components
                
                adjCities = (ArrayList<Integer>[]) new ArrayList[cities+1];//array of array lists
                for (int c = 0; c <= cities; c++) {
                    adjCities[c] = new ArrayList<Integer>();//it is an array of lists
                }
                
                visited = new boolean[cities+1];
                
                //initializing adjCities
                for (int i = 0; i < roads; i++){
                    int c1 = in.nextInt();
                    int c2 = in.nextInt();
                    
                    adjCities[c1].add(c2);
                    adjCities[c2].add(c1);
                }
                //***********************
                //for(ArrayList<Integer> a: adjCities)
                System.out.println(Arrays.toString(adjCities));    
                //***********************
                for(int c = 1; c <= cities; c++) {
                    if(!visited[c]) {
                        dfs(c);
                        connectedComponents++;
                    }
                }
           
                //System.out.println(connectedComponents);
                System.out.println(roadCost * (cities - connectedComponents) + libCost * connectedComponents);
                connectedComponents = 0;
                visited = new boolean[10000];
                adjCities = (ArrayList<Integer>[]) new ArrayList[10000+1];
            }
        }
    }
    
    private static void dfs(int city){
        visited[city] = true;
        for (int c = 0; c < adjCities[city].size(); c++){
            if(!visited[adjCities[city].get(c)]){
                dfs(adjCities[city].get(c));
            }
        }
    }
    
}