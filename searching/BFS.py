#!/bin/python3
import sys

#def shortestPath(mapp, s, currentt, nextt)
        

#perform a breadth first search
def bfs(mapp, s):#graph, start
    result = [[0]for x in range(len(mapp))]
    for i in range(len(result)):
        result[i] = -1
    que = [s]
    result[s]=0
    maxx=result
    empty = []
    while que != empty:
        nextt = que.pop()
        for i in range(len(mapp)):
            if mapp[nextt][i]==1 and result[i]==-1:
                result[i] = result[nextt]+1
                que.append(i)
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
        s = int(input().strip())-1#start node
        filled = bfs(mapp, s)
        for x in filled:
            if x==-1:
                print("{0} ".format(x), end="")
            elif x!=0:
                val=6*x
                print("{0} ".format(val), end="")
        print()