# WAP using list comprehension to include all strings in given list except those with letter ‘a’.
l1 = ["bike", "car", "bus", "train", "boat"]
string = [i for i in l1 if "a" not in i]
print(string)