print("Enter Marks of 5 subjects:")
m1 = int(input())
m2 = int(input())
m3 = int(input())
m4 = int(input())
m5 = int(input())

percent = (m1+m2+m3+m4+m5)*100/500
percent = float(percent)
print("Percentage:",percent)
if percent > 90 and percent <= 100:
    print("A Grade")
elif percent > 80 and percent < 91:
    print("B Grade")
elif percent > 70 and percent <= 81:
    print("C Grade")
elif percent > 60 and percent <= 71:
    print("D Grade")
elif percent > 50 and percent <= 61:
    print("E Grade")
elif percent >= 0 and percent < 40:
    print("Fail")
