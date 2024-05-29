#  WAP to sort a dictionary by values
d = {1: 10, 2: 30, 3: 50, 4: 100, 5: 85}
sorted_dict = dict(sorted(d.items(), key=lambda item: item[1]))
print(sorted_dict)
