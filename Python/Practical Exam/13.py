#  WAP using set comprehension to create a set of multiples of 5 till 100.
multiple = {x for x in range(101) if x % 5 == 0}
print("Set that contains multiple of 5 till 100:", multiple)
