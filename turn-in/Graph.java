import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Graph {
    
    private static ArrayList<Integer>[] adjacent_cities;
    private static int city_connections;
    private static boolean[] visited;

    private static void depth_first_search(int city){
        visited[city] = true;
        for (int c = 0; c < adjacent_cities[city].size(); c++){
            if(visited[adjacent_cities[city].get(c)]==false){
                depth_first_search(adjacent_cities[city].get(c));
            }
        }
    }

    private static void refresh(){
        city_connections = 0;
        visited = new boolean[100000];
        adjacent_cities = (ArrayList<Integer>[]) new ArrayList[100000+1];
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int cities = scan.nextInt(); 
            int roads = scan.nextInt(); 
            long lib_cost = scan.nextLong();
            long road_cost = scan.nextLong();

            if (road_cost >= lib_cost || roads == 0){ 
                System.out.println(lib_cost * cities);
                for (int i = 0; i < (roads*2); i++)
                    scan.nextInt();
                continue;
            }
               
            else{
                adjacent_cities = (ArrayList<Integer>[]) new ArrayList[cities+1];
                for (int c = 0; c <= cities; c++) 
                    adjacent_cities[c] = new ArrayList<Integer>();
                
                visited = new boolean[cities+1];
                for (int i = 0; i < roads; i++){
                    int from_city = scan.nextInt();
                    int to_city = scan.nextInt();
                    adjacent_cities[from_city].add(to_city);
                    adjacent_cities[to_city].add(from_city);
                }
                for(int c = 1; c <= cities; c++) {
                    if(!visited[c]) {
                        city_connections++;
                        depth_first_search(c);
                    }
                }
                System.out.println(road_cost * (cities - city_connections) + lib_cost * city_connections);
                refresh();               
            }
        }
    }    
}