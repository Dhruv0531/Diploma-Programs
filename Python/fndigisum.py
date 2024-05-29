def digi_sum(num):
    no_str = str(num)
    sum = 0
    for digits in no_str:
        sum += int(digits)
    print("Sum of Digits:", sum)


print("Enter a number:")
num = int(input())
digi_sum(num)

# OR
'''def digi_sum(num):
    sum = 0
    while num > 0:
        rem = num % 10
        sum += rem
        num //= 10    # floor division to get integer value in num
    print("Addition of digits:", sum)


print("Enter a number:")
num = int(input())
digi_sum(num)'''
