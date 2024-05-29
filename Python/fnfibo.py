# WAP to print fibonacci series using function
def fibo(n):
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


n = int(input("Enter Number of Series:"))
fibo(n)
