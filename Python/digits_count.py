print("Enter a number:")
num = int(input())
count = 0
while num != 0:
    count += 1
    num //= 10  #floor division for integer value
print("Number of digits:",count)
