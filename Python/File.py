# f = open("abc.txt", "w")
# f.write("Hello World.... :)")
# f = open("abc.txt", "r")
# data = f.read()
# print(data)

# WAP to read contents of abc.txt and write the same content to pqr.txt (4M)
'''f = open('abc.txt', 'r')
data = f.read()
i = open('pqr.txt', 'w')
i.write(data)
print(data)
f.close()
i.close()'''
# Other way
'''with open('abc.txt', 'r') as f1, open('pqr.txt', 'w') as f2:
    data = f1.read()
    f2.write(data)
    print(data)'''

# WAP to count frequency of each characters in a given file
'''f = open('abc.txt', 'r')
data = f.read()
count = 0
for i in data:
    fr = data.count(i)
    print(f"Char:{i}, Frequency:{fr}")'''
# Another way
'''from collections import Counter
f = open('abc.txt', 'r')
data = f.read()
count = Counter(data)
print(count)'''

# WAP to open a file in write mode and append some content at the end of file(6M)
'''f = open('abc.txt', 'w')
data = "Hello World, Welcome to Python"
f.write(data)
f.close()

f = open('abc.txt', 'a')
# d = "!! \n(:)"
f.write("123456\n1215")
f.close()

f = open('abc.txt', 'r')
print(f.read())
f.close()'''

#  WAP to make directory
'''import os as o
# o.mkdir("python")
# o.rmdir("python")
# print(o.getcwd())
# o.rename(python,py)
# o.remove("tempCodeRunnerFile.py")'''

'''a = int(input("Enter a:"))
b = int(input("Enter b:"))
try:
    c = a/b
except ZeroDivisionError:
    print("Divide by Zero Exception.. Cannot divide by zero")
finally:
    print("Finally Block")
    print(c)
'''
'''age = int(input("Enter Age:"))
try:
    if age < 18:
        raise ValueError
except ValueError:
    print("Age is not valid")
else:
    print("Age is valid")
'''
# USer defined exception
'''age = int(input("Enter Age:"))
try:
    if age < 18:
        raise Exception("Invalid Age")
    else:
        print("Valid Age")
except Exception as e:
    print("Exception:", e)
'''
# WAP for user defined exception as Odd Number Exception
'''n = int(input("Enter Number:"))
try:
    if n % 2 != 0:
        raise Exception("Odd Number")
    else:
        print("Even Number")
except Exception as e:
    print("Exception:", e)'''

'''s = input("Enter String:")
try:
    if s != "India":
        raise Exception("String Error")
    else:
        print("Entered String is:", s)
except Exception as e:
    print(e)'''

# User Defined Exception
'''class AgeException(Exception):
    def __init__(self, message):
        self.message = message


try:
    age = int(input("Enter Age:"))
    if age < 18:
        raise AgeException("Invalid Age")
    else:
        print("Valid Age")
except AgeException as e:
    print(e.message)
'''


# class OddNumberException(Exception):
#    def __init__(self, message):
#        self.message = message
#
#
# try:
#    n = int(input("Enter Number:"))
#    if n % 2 != 0:
#        raise OddNumberException("Odd NUmber Exception")
#    else:
#        print("Even Number")
# except OddNumberException as e:
#    print(e.message)

class InvalidPassowordException(Exception):
    def __init__(self, message):
        self.message = message


try:
    s = input("Enter Password:")
    if s != "abc123":
        raise InvalidPassowordException("Invalid Password")
    else:
        print("Valid Password")
except InvalidPassowordException as e:
    print(e.message)
