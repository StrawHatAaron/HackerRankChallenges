#Aaron Miller 11/28/2017

#q=given queries            first

#n=number of cities         second
#m=number of roads
#c_lib=cost of library
#c_road=cost of road

#from_city,to_city=bisectional roads      third

import sys
class Graph():
    def __init__(self, m):
        self.roads = m
        self.graph = [[0 for column in range(int(m))] for row in range(int(m))]      

    #find shortest path
    def dijkstra(self):
        min_path = [100000] * self.roads
        smallest_set = [False] * self.roads
        number_of_nodes=self.count_nodes()
        connected_nodes=self.connect_nodes()#what nodes tie to eachother
        answer = []

        for x in range(len(self.graph)):
            for y in range (len(self.graph)):
                print("LEFT OFF HERE")
                #if self.graph[x][y]>0 and 
        return answer

    # A utility function to find the vertex with 
    # minimum distance value, from the set of vertices 
    # not yet included in shortest path tree
    def minDistance(self, dist, sptSet):
 
        # Initilaize minimum distance for next node
        min = sys.maxint
 
        # Search not nearest vertex not in the 
        # shortest path tree
        for v in range(self.V):
            if dist[v] < min and sptSet[v] == False:
                min = dist[v]
                min_index = v
 
        return min_index

    #find the number of node connections per node at index
    def count_nodes(self):
        number_of_nodes = [[0]for path in range(len(self.graph))]
        for x in range(len(self.graph)):
            number_of_nodes[x]=0
        for x in range(len(self.graph)):
            for y in range(len(self.graph)):
                if self.graph[x][y]==1:
                    number_of_nodes[x]=number_of_nodes[x]+1
        return number_of_nodes

    #find the values each node connects directly to
    def connect_nodes(self):
        connected_nodes = [[0 for column in range(len(self.graph))] for row in range(len(self.graph))]
        for x in range(len(self.graph)):
            for y in range(len(self.graph)):
                if self.graph[x][y]==1:
                    #y->to  x should be the index
                    connected_nodes[x][y]= y+1
        return connected_nodes

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
            #fill up the graph with the broken roads
            g.graph[from_city][to_city]=1
            g.graph[to_city][from_city]=1
            print()
            print(g.graph)
            print(g.dijkstra())