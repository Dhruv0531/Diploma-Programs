#  WAP with function to calculate the number of uppercase and lowercase characters in given string.
def case_count(str):
    upper_count, lower_count = 0, 0
    for i in str:
        if i.isupper():
            upper_count += 1
        if i.islower():
            lower_count += 1
    print(f"Number of Upper Case:{upper_count} \nNumber of Lower Case:{lower_count}")


str = input("Enter String:")
case_count(str)
