# WAP to check entered number is plaindrome is not
def palindrome(num):
    no_str = str(num)
    rev = no_str[::-1]
    if int(rev) == int(num):
        print("Number is Palindrome")
    else:
        print("Number is not Palindrome")


print("Enter a number:")
num = int(input())
palindrome(num)
