even = odd = 0
for i in range(1, 21):
    if i % 2 == 0:
        even += i
    else:
        odd += i
print("Addition of Even numbers:", even)
print("Addition of Odd numbers:", odd)
