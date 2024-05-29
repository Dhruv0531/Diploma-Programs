# WAP to demonstrate data hiding
class Student:
    def set(self, rollno, name):
        self.__rollno = rollno  # '__' to make variable private
        self.__name = name

    def put(self):
        print("Roll No:", self.__rollno)
        print("Name:", self.__name)


s = Student()  # - Initialize object class Student
s.set(10, "xyz")  # - Student.set(s,10,"xyz")
# print(s.__name) # If we access private variable outside class it will show error
s.put()  # - Student.put(s)
