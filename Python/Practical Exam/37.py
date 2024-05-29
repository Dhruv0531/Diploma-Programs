#  WAP to demonstrate multilevel inheritance
class A:
    def a(self):
        print("Inside class A")


class B(A):
    def b(self):
        print("Inside class B")


class C(B):
    def c(self):
        print("Inside class C")


c = C()
c.a()
c.b()
c.c()
