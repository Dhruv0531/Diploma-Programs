#  WAP to demonstrate user defined functions with default arguments.

def add(x, y=2):  # If no 2nd parameter is passed then it will consider y's value as 2 as default argument
    sum = x+y
    return sum


print(add(10))
print(add(10, 20))
