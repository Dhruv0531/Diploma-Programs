print("Enter a number:")
num = int(input())
fact = 1
for i in range(1, num+1):
    fact *= i
print("Factorial of {} is:{}".format(num, fact))
print(f"Factorial of {num} is:{fact}")
