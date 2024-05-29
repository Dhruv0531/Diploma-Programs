# WAP to find the least frequency character in given string
from collections import Counter
str = "Welcome to Python Programming"
d = Counter(str)
d = min(d, key=d.get)
print(d)
