#  WAP to create a dictionary and demonstrate any four dictionary methods.
d = dict()  # Creates an empty dictionary
d1 = {1: "Apple", 2: "Bannana", 3: "Mango", 4: "Watermelon", 5: "Kivi"}
print("Initial Dictionary:", d1)
# get() method is used to get element(value) at key location of dictionary
print("Value at key 3:", d1.get(3))
d1.pop(5)  # pop() method will remove the key-value pair of passed key
print("Dictionary after pop() method is used:", d1)
# items() metho will display all elements of dictionary
print("Items of Dictionary d1:", d1.items())
# keys() method will display only key of dictionary
print("Keys of dictionary d1:", d1.keys())
# values() method will display onlu values of dictionary
print("Values of dictionary d1:", d1.values())
