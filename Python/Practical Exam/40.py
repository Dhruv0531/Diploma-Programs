# WAP to raise the ZeroDivisionError exception
a = 5
b = 0
try:
    print(a/b)
except ZeroDivisionError:
    print("Zero Divide Error")
