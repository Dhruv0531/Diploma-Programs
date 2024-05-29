#  WAP to access and demonstrate four functions of any built-in Python module.
import random as r

# Function 1: random.randint(a, b) - Generate a random integer between a and b
print("Random Number Between 1-100", r.randrange(1, 100))

# Function 2: random.random() - Return a random float between 0 and 1
print("Random Float between o and 1:", r.random())

l = ["Samsung", "OnePlus", "Apple", "Blackberry"]

# Function 3: random.choice(seq) - Choose a random element from a non-empty sequence
print("Initial List:", l)
print("Random Element from list:", r.choice(l))

# Function 4: random.shuffle(x) - Shuffle the elements of a sequence in place
r.shuffle(l)
print("Shuffeled list using shuffle function of random module:", l)
