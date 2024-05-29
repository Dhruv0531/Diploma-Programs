print("Enter 4 numbers:")
list = []
for i in range(1, 5):
    num = int(input())
    list.append(num)
print(f"Smallest Number:{min(list)}")
