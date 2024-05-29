'''1.Create a list
2. Access list elements
3. Update list elements
4. Delete list elements'''
# Creating list
l = [10, 20, 30, 40, 50]

# Accessing list elements
print("Initial List:", l)
print("Initial List:", l[1:3])
print("Reverse List:", l[::-1])

#Updating list elements
l[1]=60
print("List after updating:",l)

#Deleting list elements
l.pop()
print("List after deleting:",l)
l.clear()
print("List after deleting:",l)