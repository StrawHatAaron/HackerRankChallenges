#Aaron Miller 11/28/2017, Roads and Libraries, python 3.6
import sys
class Graph():
    def __init__(self, m, n, c_lib, c_road, a):
        self.roads = m
        self.adj_cities = [[0 for column in range(int(a))] for row in range(int(a))]
        self.connected_adj_cities = [[0 for column in range(int(a))] for row in range(int(a))]
        self.visited = [[False for column in range(int(a))] for row in range(int(a))]
        self.cities = n
        self.lib_cost = c_lib
        self.road_cost = c_road
        self.connected_nodes=1

    def isEmpty(self):
        for x in range(len(self.adj_cities)):
            for y in range(len(self.adj_cities)):
                if self.adj_cities[x][y]==1:
                    return False
        return True

    #find the values each node connects directly to
    def connect_adj_cities(self):
        for x in range(len(self.adj_cities)):
            for y in range(len(self.adj_cities)):
                if self.adj_cities[x][y]==1:
                    self.connected_adj_cities[x][y]= y

    def depth_first_search(self, city):
        self.visited[city]=True
        for c in range(len(1, self.connected_adj_cities)):
            if self.visited[self.connected_adj_cities[city][c]]==False:
                print(self.connected_adj_cities[city][c])
                self.depth_first_search(self.connected_adj_cities[city][c])

    #find the smallest total cost
    def dijkstra_cost(self):
        for city in range(1, self.cities):
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
        g = Graph(m, n, c_lib, c_road, 1000)
        for roads in range(m):
            from_city, to_city = input().strip().split()
            from_city, to_city = [int(from_city)-1, int(to_city)-1]
            g.adj_cities[from_city][to_city]=1
            g.adj_cities[to_city][from_city]=1
        #build a libary in each city then
        if c_road>c_lib or c_road==0 or g.isEmpty():
            ans=n*c_lib
            print(ans)
        #find how many roads and libraries will be needed
        else:
            g.connect_adj_cities()
            best_cost = g.dijkstra_cost()
            print(best_cost)