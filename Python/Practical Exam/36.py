# WAP to demonstrate multiple inheritance
class A:
    def display(self):
        print("Inside class A")


class B:
    def put(self):
        print("Inside class B")


class C(A, B):
    def show(self):
        print("Inside class C")


c = C()
c.display()
c.put()
c.show()
