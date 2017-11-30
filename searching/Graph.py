#Aaron Miller 11/28/2017, Roads and Libraries, python 3.6
import sys
class Graph():
    """docstring for Graph"""
    def __init__(self, cities):
        self.visited = [[False] for x in range(cities+1)]
        self.adjCities = [[] for x in range(cities+1)]
        self.connectedComponents = 0

    def dfs(self, city):
        visited[city] = True
        for c in range():
            if visited[adjCities[city].index(c)]:
                dfs(adjCities[city].index(c))


if __name__ == "__main__":
    q = input().strip()
    q = int(q)
    for a in range(q+1):
        cities, roads, libCost, roadCost = input().strip().split()
        cities, roads, libCost, roadCost = [int(cities), int(roads), int(libCost), int(roadCost)]

        if roadCost >= libCost or roads == 0:
            print(libCost*cities)
            check = input()
            if roads != 0 or len(check.strip())!=4:
                for i in range(roads*2):
                    try:
                        c1, c2 = check.strip().split()
                        c1, c2 = [int(c1), int(c2)]
                    except ValueError:
                        print("ValueError")
                        break

        else:
            #adjCities = [[] for x in range(cities+1)]
            #print(adjCities)
            #for c in range(cities):
                #adjCities[c]=java would have instantiatio
            #visited = [[False] for x in range(cities+1)]
            g = Graph(cities)
            #init adjCities
            for i in range(roads+1):
                try:
                    c1, c2 = input().strip().split()
                    c1, c2 = [int(c1), int(c2)]
                    g.adjCities[c1].append(c2)
                    g.adjCities[c2].append(c1)
                except ValueError:
                    print("ValueError")
                    continue
            print()
            print("adjCities={0}".format(g.adjCities))   

            print

            for c in range(cities+1):
                if g.visited[c]==False:
                    dfs(c)
                    g.connectedComponents=g.connectedComponents+1
            print(roadCost * (cities - g.connectedComponents) + libCost * g.connectedComponents)
            g.connectedComponents=0
            g.visited = [[False] for x in range(cities+1)]
            g.adjCities = [[] for x in range(cities+1)] 




