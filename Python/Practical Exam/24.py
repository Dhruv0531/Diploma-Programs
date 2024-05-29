#  WAP with function that takes a number as parameter and checks if it is prime or not.
def prime(num):
    for i in range(2, num):
        if num % i == 0:
            print("Not Prime")
            break
    else:
        print("Prime")


num = int(input("Enter Number:"))
prime(num)
