#Aaron Miller
import sys

#perform a breadth first search
def bfs(mapp, s):#graph, start
    paths = [[0]for x in range(len(mapp))]
    for i in range(len(paths)):
        paths[i] = -1
    que = list()
    que.append(s)
    paths[s]=0
    empty = []
    while que != []:
        nextt = que.pop(0)
        for i in range(len(mapp)):
            if mapp[nextt][i]==1 and paths[i]==-1:
                paths[i] = paths[nextt]+1
                que.append(i)
    return paths


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
        paths = bfs(mapp, s)
        for x in paths:
            if x==-1:
                print("{0} ".format(x), end="")
            elif x!=0:
                val=6*x
                print("{0} ".format(val), end="")
        print()