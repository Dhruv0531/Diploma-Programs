# WAP to display the sum of digits and reverse of a number.
num = int(input("Enter Number:"))
sum = 0
rev = str(num)[::-1]
while num > 0:
    rem = num % 10
    sum += rem
    num //= 10    # floor division to get integer value in num
print("Addition of digits:", sum)
print("Reversed Number:", int(rev))
