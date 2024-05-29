# class Student:  # - by default everything is public
#     def set(self):
#         self.rollno = 10
#         self.name = "xyz"

#     def put(self):
#         print("Roll No:", self.rollno)
#         print("Name:", self.name)


# s = Student()
# s.set()
# s.put()

# Parameterized Class
'''
class Student:
    def set(self, rollno, name):
        self.rollno = rollno
        self.name = name

    def put(self):
        print("Roll No:", self.rollno)
        print("Name:", self.name)


s = Student()  # - Method call statement
s.set(10, "xyz")  # - Student.set(s,10,"xyz")
s.put()  # - Student.put(s)


class Student1:
    branch = "Computer"  # Class Variable

    def set(self, div):
        # self.branch = branch
        self.div = div

    def put(self):
        print("Branch:", self.branch)
        print("Division:", self.div)


s1 = Student1()
print(s1.branch)  # Accessing class variable
s1.set("A")
s1.put()'''

# class Student:
#     def set(self, rollno, name):
#         self.__rollno = rollno # '__' to make variable private
#         self.__name = name

#     def put(self):
#         print("Roll No:", self.__rollno)
#         print("Name:", self.__name)


# s = Student()  # - Method call statement
# s.set(10, "xyz")  # - Student.set(s,10,"xyz")
# # print(s.__name)
# s.put()  # - Student.put(s)
'''
class Student:
    def set(self, rollno, name):
        self._rollno = rollno  # '_' to make variable protected
        self._name = name

    def put(self):
        print("Roll No:", self._rollno)
        print("Name:", self._name)


s = Student()  # - Method call statement
s.set(10, "xyz")  # - Student.set(s,10,"xyz")
s.put()  # - Student.put(s)'''
# Method Overloading


# class Demo:
#     # def add(self, a, b):
#     #     return a+b

#     def add(self, a=None, b=None, c=None):
#         sum = 0
#         if a != None and b != None and c != None:
#             sum = a+b+c
#         elif a != None and b != None and c == None:
#             sum = a+b
#         return sum


# d = Demo()
# print(d.add(10, 20, 30))
# print(d.add(10, 20))

# Variable length argument
# class Demo:
#     def add(self, *var):
#         return sum(var)
#         # sum=0
#         # for i in var:
#         # sum+=i
#         # return sum


# d = Demo()
# print(d.add(10, 20, 30))
# print(d.add(10, 20))
# print(d.add(10, 20, 50, 20))

# class Demo:
#     def add(self, a, b):
#         return a+b
# d = Demo()
# print(d.add(10, 20))
# print(d.add(10.5, 20.1))
# print(d.add("Hello", "World!"))

# Inheritance
# Single Inheritance
# class A:
#     pass

# class B(A):
#     pass

# Class person (name,age) <- class Employee(designation)

# class Person:
#     def set(self):
#         self.name = "abc"
#         self.age = 18

#     def display(self):
#         print("Name:", self.name)
#         print("Age:", self.age)


# class Employee(Person):
#     def setemp(self):
#         self.set()
#         self.desi = "CEO"


#     def displayemp(self):
#         print("Designation:", self.desi)


# e = Employee()
# e.set()
# e.setemp()
# e.display()
# e.displayemp()


# class  person (name,age) <- class Employee(designation) <- Manager)Qualification)
# class Person:
#     def set(self):
#         self.name = "abc"
#         self.age = 18

#     def display(self):
#         print("Name:", self.name)
#         print("Age:", self.age)


# class Employee(Person):
#     def setemp(self):
#         self.desi = "CEO"

#     def displayemp(self):
#         print("Designation:", self.desi)


# class Manager(Employee):
#     def setq(self):
#         self.q = "MBA"

#     def disq(self):
#         print("Qualification:", self.q)


# m = Manager()
# m.set()
# m.setemp()
# m.display()
# m.displayemp()
# m.setq()
# m.disq()

# Multiple Inheritance
# class A:
#     pass
# class B(A):
#     pass
# class E(A,B):
#     pass

# Hirarchical Inheritance
# class A:
#     pass
# class B(A):
#     pass
# class C(A):
#     pass

# WAP to create parent class Name, Animal and a child class Herbivrous which will extend class Animal in the child class Herbivrous oversight the method feed(),breed, create a object.
'''class Animal:
    def breath(self):
        print("I breath air")

    def feed(self):
        print("I eat Food")


class Herbivrous(Animal):
    def feed(self):
        print("I eat only grass")


h = Herbivrous()
h.breath()
h.feed()'''


# Animal <- Dog Animal <- Cat
'''class Animal:
    def speak(self):
        print("I Speak")


class Dog(Animal):

    def speak(self):
        print("Bho bho")


class Cat(Animal):

    def speak(self):
        print("Meow Meow")


d = Dog()
d.speak()
c = Cat()
c.speak()'''

# WAP to read and print the student information using 2 classes (Single Inheritance), Student(rollno, name), Test(mark1, mark2)
'''class Student:
    def sets(self):
        self.rollno = int(input("Enter Roll No:"))
        self.name = input("Enter Name:")

    def put(self):
        print("Roll No:", self.rollno)
        print("Name:", self.name)


class Test(Student):
    def setm(self):
        self.sets()
        self.m1 = int(input("Enter Mark 1:"))
        self.m2 = int(input("Enter Mark 2:"))

    def putm(self):
        self.put()
        print(f"Mark 1:{self.m1}\nMark 2:{self.m2}")


t = Test()
t.setm()
t.putm()'''

# Python Composition
'''class A:
    def __init__(self):
        print("class A object created")

    def display(self):
        print("class A method called")


class B:
    def __init__(self):
        self.obj1 = A() # Composition
        print("class B object created")
    def show(self):
        self.obj1.display()
        print("class B method called")
        
b = B()
b.show() '''

# Salary(DA,HRA,basic), Employee(Name, Age) using python composition


# Method Overriding: Method prototype in base class exactly matches to the method prototype of derived class
'''class A:
    def display(self):
        print("This is super class")


class B(A):
    def display(self):
        A.display(self)  # Calling display method of class A
        super().display() # Calling display method of class A
        print("This is sub class")


b = B()
b.display()'''


# Constructor - accessing super class members in sub class
'''class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def display(self):
        print(f"Name:{self.name} \nAge:{self.age}")


class Employee(Person):
    def __init__(self, name, age, desi):
        super().__init__(name, age)
        # Person.__init__(self,"Dhruv",18)   Different method to call constructor
        self.desi = desi

    def display(self):
        super().display()  # No need of "self"
        # Person.display(self)
        print(f"Designation:{self.desi}")


e = Employee("Dhruv", 18, "CEO")
e.display()'''

# self - contains reference of current object
