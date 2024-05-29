# WAP with function to calculate the factorial of a given number
def fact(num):
    fact = 1
    for i in range(1, num+1):
        fact *= i
    print(f"Factorial of {num} is: {fact}")


print("Enter Number:")
num = int(input())
fact(num)
