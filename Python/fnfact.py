# WAP to calculate factorial of entered number using fn
def fact(num):
    fact = 1
    for i in range(1, num+1):
        fact *= i
    print(f"Factorial of {num} is:{fact}")


print("Enter Number:")
num = int(input())
fact(num)
