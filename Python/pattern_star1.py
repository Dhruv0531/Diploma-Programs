#      *
#    * * *
#  * * * * *
#    * * *
#      *
s = 4
for i in range(1,6):
    for j in range(1, s+1):
        print(" ", end="")
    for k in range(1, i+1):
        print("*", end=" ")
    print()
    s -= 1