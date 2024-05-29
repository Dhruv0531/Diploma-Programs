# WAP to reverse the entered number using fn
def rev(num):
    no_str = str(num)
    rev = no_str[::-1]
    return int(rev)


print("Enter Number:")
num = int(input())
print("Reversed Number:", rev(num))
