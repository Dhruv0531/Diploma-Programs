#  WAP to count the number of vowels in the given string.
str = "Welcome to Python Programming"
print("String str:", str)
count = 0
for i in str:
    if 'a' in i or 'e' in i or 'i' in i or 'o' in i or 'u' in i:
        count += 1
print("Number of Vowels in String:", count)
