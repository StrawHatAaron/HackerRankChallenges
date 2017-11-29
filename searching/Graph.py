import sys
class Graph():
    def __init__(self, m):
        self.roads = m
        self.graph = [[0 for column in range(int(m))] for row in range(int(m))]      

    #find shortest path
    def dijkstra(self):
        min_path = [100000] * self.m
        #min_path = [n] no starting node so this wont work
        smallSet = [False] * self.m
        for x in xrange(self.m):
            print("NOT DONE HERE YET")
        return graph

    #search by depth and return each nodes connections to other nodes
    #def dfs_connect(self):
    #   return self

if __name__ == "__main__":
    total_cost=0
    q=int(input().strip())
    for que in range(q):
        n, m, c_lib, c_road = input().strip().split()
        n, m, c_lib, c_road = [int(n), int(m), int(c_lib), int(c_road)]
        g = Graph(m)
        for roads in range(m):
            from_city, to_city = input().strip().split()
            from_city, to_city = [int(from_city)-1, int(to_city)-1]
            g.graph[from_city][to_city]=1
            g.graph[to_city][from_city]=1
            
                


#Aaron Miller 11/28/2017

#q=given queries            first

#n=number of cities         second
#m=number of roads
#c_lib=cost of library
#c_road=cost of road

#from_city,to_city=bisectional roads      third