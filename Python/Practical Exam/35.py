#  WAP to demonstrate method overriding
class A:
    def method(self):
        print("This is Method of class A")


class B(A):
    def method(self):
        print("This is Method of class B")


b = B()
b.method()
