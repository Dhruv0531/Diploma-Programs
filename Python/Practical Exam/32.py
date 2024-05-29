#  WAP to create a class and display class attributes.
class Employee:
    def set(self):
        self.name = "abc"
        self.age = 20
        self.desi = "Tester"

    def display(self):
        print(f"Name:{self.name} \nAge:{self.age} \nDesignation:{self.desi}")


e = Employee()
e.set()
e.display()
