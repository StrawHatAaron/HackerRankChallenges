#Aaron Miller 11/28/2017, Roads and Libraries, python 3.6
import sys
class Graph():
    def __init__(self, m, n, c_lib, c_road):
        self.roads = m
        self.adj_cities = [[0 for column in range(int(m))] for row in range(int(m))]
        self.visited = [False] * n
        self.cities = n
        self.lib_cost = c_lib
        self.road_cost = c_road
        self.connected_nodes=0

    def depth_first_search(self, city):
        self.visited[city]=True
        for c in range(1, len(self.adj_cities)):
            if self.visited[self.adj_cities[city][c]]==False:
                self.depth_first_search(self.adj_cities[city][c])

    #find the smaallest total cost
    def dijkstra_cost(self):
        for city in range(self.cities):
            if self.visited[city] == False:
                self.depth_first_search(city)
                self.connected_nodes=self.connected_nodes+1
        ans = self.road_cost * (self.cities - self.connected_nodes) + self.lib_cost * self.connected_nodes
        return ans

if __name__ == "__main__":
    q=int(input().strip())
    for que in range(q):
        n, m, c_lib, c_road = input().strip().split()
        n, m, c_lib, c_road = [int(n), int(m), int(c_lib), int(c_road)]
        for roads in range(m):
            g = Graph(m, n, c_lib, c_road)
            from_city, to_city = input().strip().split()
            from_city, to_city = [int(from_city)-1, int(to_city)-1]
            #build a libary in each city then
            if c_road>c_lib or c_road==0:
                ans=n*c_lib
                print(ans)
            #find how many roads and libraries will be needed
            else:
                g.adj_cities[from_city][to_city]=1
                g.adj_cities[to_city][from_city]=1
                print()
                best_cost = g.dijkstra_cost()
                print(best_cost)