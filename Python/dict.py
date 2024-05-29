''' Dictionary of student that includes there roll number and name 
1. Add three student in above dictionary
2. Update Name = Shreyas of Roll number 2
3. Delete the information of roll number = 1'''

d = {1: 'Dhruv', 2: 'Samarthya', 3: 'Mohit'}
print("Initial Dictionary:", d)

d[2]='Sheryas'
print("After updating name of roll number 2:",d)

d.pop(1)
print("After removing information of roll number 1:",d)
