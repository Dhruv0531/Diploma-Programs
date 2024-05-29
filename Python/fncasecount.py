# WAP that accepts a string and calculate the number of uppercase and lowercase letters using function

def count(str):
    lc, uc = 0, 0
    for ch in str:
        if ch.islower():
            lc += 1
        if ch.isupper():
            uc += 1
    print(f"Upper Case Count:{uc} \nLower Case Count:{lc}")


str = input("Enter String:")
count(str)
