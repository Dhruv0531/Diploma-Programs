# WAP to swap the value of two variables using fn
def swap(a, b):
    print(f"Before Swapping\nA:{a}, B:{b}")
    a, b = b, a
    print(f"After Swapping\nA:{a}, B:{b}")


a = int(input("Enter value of A:"))
b = int(input("Enter value of B:"))
swap(a, b)
