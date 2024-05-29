# WAP to open a file in append mode, write data to it and then read it
f = open("demo.txt", "a")
f.write("Hello World")
f.close()
f = open("demo.txt", "r")
print(f.read())
f.close()
