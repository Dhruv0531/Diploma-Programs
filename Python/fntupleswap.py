# WAP to swap tuple
def swap(t1, t2):
    print(f"Before Swapping\n t1:{t1}\n t2:{t2}")
    t1, t2 = t2, t1
    print(f"After Swapping\n t1:{t1}\n t2:{t2}")


t1 = (1, 2, 3)
t2 = (4, 5, 6)
swap(t1, t2)
