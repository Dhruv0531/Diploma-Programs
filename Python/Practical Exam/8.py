#  WAP using list comprehension to create a list of squares of all even nos from a given list.
l1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
squares = [i**2 for i in l1 if i % 2 == 0]
print("List of squares of all even nos:", squares)
