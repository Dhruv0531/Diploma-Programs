# WAP to calculate the area and circumference of circle using math module
import math


def area(r):
    a = math.pi*r**2
    circum = 2*math.pi*r
    print(f"Area of Circle:{a:.2f} \nCircumference of Cirlce:{circum:.2f}")


r = float(input("Enter Radius of Circle:"))
area(r)

