# WAP to access and demonstrate any four functions of math module
import math as m
x = 10
print("X = ", x)

# Function 1: math.sqrt(x) - Square root of a number
print(f"Square root of {x}:{m.sqrt(x)}")

# Function 2: math.pow(x, y) - Power of x raised to the y-th power
print(f"Square of {x}:{m.pow(x, 2)}")

# Function 3: math.sin(x) - Sine of x (in radians)
angle_in_radians = m.pi / 4  # 45 degrees in radians
print(f"Sine of {angle_in_radians} radians: {m.sin(angle_in_radians)}")

# Function 4: math.factorial(x) - Factorial of a number
print(f"Factorial of {x}:{m.factorial(x)}")
