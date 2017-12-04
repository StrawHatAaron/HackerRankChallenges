import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Graph {
    private ArrayList<Integer>[] adjacent_cities;
    private int city_connections;
    private boolean[] visited;

    public Graph(ArrayList<Integer>[] adjacent_cities, int city_connections, boolean[] visited, int cities){
        this.adjacent_cities = adjacent_cities;
        for (int i = 0; i <= cities; i++) 
                     this.adjacent_cities[i] = new ArrayList<Integer>();
        this.city_connections = city_connections;
        this.visited = visited;
    }

    private void depth_first_search(int city){
        this.visited[city] = true;
        for (int c = 0; c < this.adjacent_cities[city].size(); c++){
            if(this.visited[adjacent_cities[city].get(c)]==false)
                depth_first_search(this.adjacent_cities[city].get(c));
        }
    }   

    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for(int que = 0; que < q; que++){
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
                Graph city_map = new Graph((ArrayList<Integer>[]) new ArrayList[cities+1], 
                    0, new boolean[cities+1], cities);               
                for (int i = 0; i < roads; i++){
                    int from_city = scan.nextInt();
                    int to_city = scan.nextInt();
                    city_map.adjacent_cities[from_city].add(to_city);
                    city_map.adjacent_cities[to_city].add(from_city);
                }
                for(int i = 1; i <= cities; i++) {
                    if(city_map.visited[i]==false) {
                        city_map.city_connections++;
                        city_map.depth_first_search(i);
                    }
                }
                System.out.println(road_cost * (cities - city_map.city_connections) + lib_cost * city_map.city_connections);             
}}}}