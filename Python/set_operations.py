# Create Set
# Access set element
# Update Set
# Delete Set

# Create Set
s = {10, 20, 30, 40, 50}

# Access set element
print("Initial Set:", s)

# update Element
s.add(60)  # single element
print("Updated Set:", s)
s.update(['A', 'B'])  # multiple elements
print("Updated Set:", s)

# Deleting set elements
print("Delete Set")
s.remove('A')  # removing specific element
print(s)
s.discard(60)  # removing specific element
print(s)
s.pop()  # remove random element
print(s)
