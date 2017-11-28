#!/bin/python3
import sys

#perform a breadth first search
def bfs(mapp, s):#graph, start
    result = [[0]for x in range(len(mapp))]
    for i in range(len(result)):
        result[i] = -1

    que = [s]
    #que.append(s)        
    #print("s val = {0}".format(s))
    #print(result)
    result[s]=0
    empty = []
    while que != empty:
        nextt = que.pop()
        #print("does this")
        for i in range(len(mapp)):
            if mapp[nextt][i]==1 and result[i]==-1:
                result[i] = result[nextt]+1
                que.append(i)
                print("does this print")

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
        print(filled)

        for x in range(len(filled)):
            if filled[x]==-1:
                print("{0} ".format(filled[x]), end="")
            elif filled[x]!=0:
                val=abs(6*filled[x])
                print("{0} ".format(val), end="")
        print()

