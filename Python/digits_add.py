print("Enter a number:")
num = int(input())
sum = 0
while num > 0:
    rem = num % 10
    sum += rem
    num //= 10    # floor division to get integer value in num
print("Addition of digits:", sum)
