# WAP to check prime number using function
def prime(num):
    for i in range(2, num):
        if num % i == 0:
            print("Not Prime")
            break
    else:
        print("Prime")


num = int(input("Enter Number:"))
prime(num)
