# WAP to combine values of two dictionaries having similar keys and create a new dictionary.
d1 = {1: 10, 2: 20, 3: 30, 4: 40, 6: 60}
d2 = {4: 40, 5: 50, 6: 60, 7: 70, 8: 80}
combined_dict = {}
for key in d1:
    if key in d2:
        combined_dict[key] = d1[key]+d2[key]
print("Dictionary withsimilar keys:", combined_dict)
