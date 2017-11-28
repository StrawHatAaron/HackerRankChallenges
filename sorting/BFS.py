#!/bin/python3
import sys

#perform a breadth first search
def bfs(mapp, s):#graph, start
    result = [[0]for x in range(len(mapp))]
    for i in range(len(result)):
        result[i] = -1

    que = []
    que.append(s)        
    #print("s val = {0}".format(s))
    #print(result)
    result[s]=0
    count = 0
    
    while not que:
        next = que.pop()
        for j in range(mapp):
            if mapp[next][j]==1 and result[i]==-1:
                result[i] = result[next]+1
                q.append(count)
                count+=1
    return result

if __name__ == "__main__":
    q = int(input().strip())
    for a0 in range(q):
        n, e = input().strip().split(' ')
        n, e = [int(n), int(e)]#n=nodes e=edges
        mapp = [[0 for x in range(n)] for y in range(n)]
        
        for a1 in range(e):
            u, v = input().strip().split(' ')
            u, v = [int(u)-1, int(v)-1]#u:from,  v:to
            mapp[u][v]=1
            mapp[v][u]=1
            
        s = int(input().strip())#start node
        #print(mapp)
        #print(len(mapp))
        filled = bfs(mapp, s)
        #print(filled)

        for x in filled:
            if(x==-1):
                print("{0} ".format(x), end="")
            if(x!=0):
                val=6*x
                print("{0} ".format(val), end="")
        print()