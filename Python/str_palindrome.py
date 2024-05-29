print("Enter a String:")
s=input()
temp=s
rev=s[::-1]
print(rev)
if temp==rev:
    print(f"String {s} is Palindrome")
else:
    print(f"String {s} is not Palindrome")