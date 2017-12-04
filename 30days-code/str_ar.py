import sys

q = int(input())
for que in range(q):
    string = input()
    strList= list(string)
    count = 0
    fList = []
    bList = []
    for s in strList:
        if count % 2 == 0:
            fList.append(s)
        else:
            bList.append(s)
        count+=1
    for f in fList:
        print(f, end="")

    print(" ", end="")

    for b in bList:
        print(b, end="")

    print()
