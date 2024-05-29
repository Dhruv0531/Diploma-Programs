#  WAP to create a tuple from two existing tuples using slicing
t1 = (1, 2, 3, 4, 5)
t2 = (6, 7, 8, 9, 10)
t3 = t1[1::2]+t2[0::2]
print("Tuple t1:", t1, "\nTuple t2:", t2)
print("Tuple t3 that contains even number from tuple t1 and t2:", t3)
