#  WAP to find all unique values in a dictionary
d1 = {1: 10, 2: 20, 3: 30, 4: 10, 5: 40, 6: 50, 7: 30}
print("Initial Dictionary:", d1)
unique = list(sorted({val for val in d1.values()}))
print("Unique values of d1:", str(unique))
