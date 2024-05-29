#  WAP to check if given number is palindrome or not.
num = int(input("Enter Number:"))
temp = str(num)[::-1]
if temp == str(num):
    print("Number in Palindrome")
else:
    print("Number is not Palindrome")
     