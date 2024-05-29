#  WAP to demonstrate user defined functions with keyword arguments.
def add(x, y):
    sum = x+y
    return sum


print(add(x=5, y=10))
print(add(y=15, x=5))
