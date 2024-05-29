# WAP to count number of digits in entered number using function
def digi_count(num):
    count = 0
    while num > 0:
        count += 1
        num //= 10    # floor division to get integer value in num
    print("Addition of digits:", count)


print("Enter a number:")
num = int(input())
digi_count(num)
