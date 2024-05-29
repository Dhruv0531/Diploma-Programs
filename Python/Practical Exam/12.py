#  WAP to create a set and demonstrate any four set methods.
A = {1, 2, 3, 4, 5, 6, 1, 5, 4}
B = {5, 7, 8, 9, 10, 1, 8, 2}
print(f"Initial Set A:{A}, B:{B}")

# Set Union
print(f"Union of A and B:{A | B}")
# OR
print(f"Union of A and B:{A.union(B)}")

# Set Intersection
print(f"Intersection of A and B:{A & B}")
# OR
print(f"Intersection of A and B:{A.intersection(B)}")

# Set Difference
print(f"Difference of A and B:{A - B}")
# OR
print(f"Difference of B and A:{B - A}")
# OR
print(f"Difference of A and B:{A.difference(B)}")
# OR
print(f"Difference of B and A:{B.difference(A)}")

# Set Symmetric Difference
print(f"Symmteric Difference of A and B:{A ^ B}")
# OR
print(f"Symmteric Difference of A and B:{A.symmetric_difference(B)}")

