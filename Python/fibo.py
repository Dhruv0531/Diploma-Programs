print("Enter a number:")
n = int(input())
f1, f2, sum = 0, 1, 0
if (n == 0):
    print(0)
else:
    print("Fibonacci Series:", f1, f2, end=' ')
    for i in range(2, n):
        sum = f1+f2
        print(sum, end=' ')
        f1 = f2
        f2 = sum
