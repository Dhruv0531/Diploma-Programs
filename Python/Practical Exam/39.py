#  WAP to read contents of file1.txt and write the same to file2.txt
f1 = open("file1.txt", "r")
f2 = open("file2.txt", "w")
f2.write(f1.read())
f1.close()
f2.close()
f2 = open("file2.txt", "r")
print(f2.read())
