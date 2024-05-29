#  WAP to find the repeated elements of a list.
l1 = [10, 20, 30, 40, 10]
temp = []
for i in range(len(l1)):
    for j in range(i+1, len(l1)):
        if l1[i] == l1[j] and l1[i] not in temp:
            temp.append(l1[i])
print("Repeated Elements of List:", temp)
