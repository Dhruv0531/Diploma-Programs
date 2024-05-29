# WAP to create 2 matric and perform addition on matric
import numpy as n
a1 = [[1, 2, 3], [4, 5, 6]]
a2 = [[7, 8, 9], [10, 11, 12]]
a3 = [[0, 0, 0], [0, 0, 0]]
for i in range(len(a1)):
    for j in range(len(a1[0])):
        a3[i][j] = a1[i][j]+a2[i][j]
for i in a3:
    print(i)
 