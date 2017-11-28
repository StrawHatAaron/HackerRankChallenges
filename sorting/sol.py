#!/bin/python3
import sys

if __name__ == "__main__":
    q = int(input().strip())
    for a0 in range(q):
        n, m = input().strip().split(' ')
        n, m = [int(n), int(m)]
        for a1 in range(m):
            u, v = input().strip().split(' ')
            u, v = [int(u), int(v)]
        s = int(input().strip())
